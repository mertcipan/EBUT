package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
/**
 * Exports whole catalog or articles whose short description matches a given String entered by the user
 * 
 * export as XHTML(view) or BMECAT(view or download)
 * 
 * export class implements the interface IValidator
 * @author Paul und Mitu
 *
 */
public class Export implements IValidation {
	
	/**
	 * exports the whole Catalog
	 * @return Product catalog
	 */
	public static Document exportWholeCatalog(ArrayList<String> errorList){
		Document document= null;
		try {
			 document = createCatalog();
		} catch (ParserConfigurationException e) {
			errorList.add("Error while creating DOM");
			e.printStackTrace();
		}
		return document;
	}
	
	/**
	 * exports the Catalog with articles that match a search string
	 * @param errorList the ErrorList to inform user
	 * @param search The Search string
	 * @return BMECAT conform document
	 */
	public static Document exportSearch(ArrayList<String> errorList, String search){
		Document document= null;
		try {
			 document = createSelectedCatalog(errorList, search);
		} catch (ParserConfigurationException e) {
			errorList.add("Error while creating DOM");
			e.printStackTrace();
		}
		return document;
	}
	
	/**
	 * Creates the BMECat catalog
	 * @return document The whole Catalog with <b>all</b> entries
	 * @throws ParserConfigurationException 
	 */
	public static Document createCatalog() throws ParserConfigurationException{
		List<BOProduct> productList = ProductBOA.getInstance().findAll();
		Document document = createDocument();
		document = createDOMWithoutArticles(document);
		for(BOProduct bop : productList){
			appendArticle(document, bop);
		}
		return document;
	}

	/**
	 * 
	 * @param errorList The errorList could be used to inform the User
	 * @param search The search Query to find selected Products
	 * @return catalog The whole Catalog with <b>Products that match the search String</b> entries
	 * @throws ParserConfigurationException
	 */
	public static Document createSelectedCatalog(ArrayList<String> errorList, String search) throws ParserConfigurationException{
		List<BOProduct> productList = ProductBOA.getInstance().findAll();
		Boolean foundOne=false;
		Document document = createDocument();
		document = createDOMWithoutArticles(document);
		for(BOProduct bop : productList){
			if(bop.getShortDescription().toLowerCase().contains(search.toLowerCase())){
				foundOne=true;
				appendArticle(document, bop);
			}
		}
		if(!foundOne){
			errorList.add("No article with given description: " +search+ " found");
		}
		return document;
	}
	
	/**
	 * Converts XML to W3C valid XHTML 
	 * @param xml
	 * @param context
	 * @param userId
	 * @param errorList
	 * @return the Path to the File
	 */
	public static String convertToXHTML(String xml, ServletContext context, Integer userId, ArrayList<String> errorList){
		String path ="catalog_export"+userId+".XHTML";
		File file = new File(context.getRealPath(path));
		try {
			//load Transformation
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer;
		transformer = factory.newTransformer(new StreamSource("/Users/mertcipan/EBUT/WholesalerWebDemo/schemaFiles/transformationsheet.xslt"));
		transformer.transform(new StreamSource(context.getRealPath(xml)), new StreamResult(file));
		} catch (TransformerConfigurationException e) {
			errorList.add("Error while transforming File");
			e.printStackTrace();
		} catch (TransformerException e) {
			errorList.add("Error while transforming File");
			e.printStackTrace();
		}
		return path;
	}
	
	
	/**
	 * Writes Document into File
	 * @param document The Document that should be transformed 
	 * @param context The ServletContext to get the relative path
	 * @param userId The userId is needed for the filename
	 * @param errorList The errorList to inform User in case of error
	 * @return the Path to the File
	 */
	public static String writeDOMIntoFile(Document document, ServletContext context, Integer userId, ArrayList<String> errorList){
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
		String path=dateFormat.format(date)+"catalog_export.xml";
		File file=null;
		try {
			//load Transformation
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			//create file
			file = new File(context.getRealPath(path));
			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);
		} catch (TransformerConfigurationException e) {
			errorList.add("Configuration Error while transforming");
			e.printStackTrace();
		} catch (TransformerException e) {
			errorList.add("Error while transforming");
			e.printStackTrace();
		}
		
		return path;
	}
	
	/**
	 * Creates an empty document
	 * @return empty document The empty document
	 * @throws ParserConfigurationException If Document couldn't be created
	 */
	public static Document createDocument() throws ParserConfigurationException{
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.newDocument();
		return document;
	}
	
	/**
	 * This Method creates the Basis for the DOM-Structure
	 * @param document empty document in which gets filled with the BasisDOM
	 * @return document The BasisDOM Document 
	 * @throws ParserConfigurationException If Document couldn't be created
	 */
	public static Document createDOMWithoutArticles(Document document) throws ParserConfigurationException{
		
		//Create ROOT-Element with attributes and append ROOT-Element to document
		Element root = document.createElement("ROOT");
		root.setAttribute("version", "1.2");
		root.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		root.setAttribute("xsi:noNamespaceSchemaLocation", "shemaFiles/stylesheet.xsd");
		document.appendChild(root);
		
		//Create HEADER-Element and append to ROOT
		Element header = document.createElement("HEADER");
		root.appendChild(header);
		
		//Create T_NEW_CATALOG-Element and to "HEADER"
		Element t_new_catalog = document.createElement("T_NEW_CATALOG");
		root.appendChild(t_new_catalog);
		
		//Create AUTHOR-Element and append to "HEADER"
		Element author = document.createElement("AUTHOR");
		header.appendChild(author);
		
		//Create AUTHOR_NAME-Element, append to "AUTHOR" and fill with text
		Element author_name = document.createElement("AUTHOR_NAME");
		author.appendChild(author_name);
		author_name.insertBefore(document.createTextNode("Mert, Egzon"), author_name.getLastChild());
		
		//Create CATALOG-Element and append to HEADER
		Element catalog = document.createElement("CATALOG");
		header.appendChild(catalog);
		//Create CATALOG_NAME-Element, append to "CATALOG" and fill with text
		Element catalog_name = document.createElement("CATALOG_NAME");
		catalog.appendChild(catalog_name);
		catalog_name.insertBefore(document.createTextNode("[EBUT_SS17]PRODUKTKATALOG eBusiness Framework"), catalog_name.getLastChild());
		
		//Create LANGUAGE-Element and append to CATALOG
		Element language = document.createElement("LANGUAGE");
		catalog.appendChild(language);
		//Fill LANGUAGE-Element with "deu" for german 
		language.insertBefore(document.createTextNode("deu"), language.getLastChild());
		
		//Create DATE-Element and append to CATALOG
		Element currentDate = document.createElement("DATE");
		catalog.appendChild(currentDate);
		//Definition of Date for HEADER Information
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		//Automatically fill Date Element with current Date
		currentDate.insertBefore(document.createTextNode(dateFormat.format(date)), currentDate.getLastChild());
	
		return document;
	}
	
	/**
	 * Adds an article to the Document -> BMECAT conform
	 * @param document The BMECAT Document where the Product should be added
	 * @param product The Product
	 * 
	 */
	public static void appendArticle(Document document, BOProduct product){
		
		Node t_new_catalog = document.getElementsByTagName("T_NEW_CATALOG").item(0);
		
		//Create ARTICLE
		Element article = document.createElement("ARTICLE");
		t_new_catalog.appendChild(article);
		
		//Create SUPPLIER_AID, insert content and append it to ARTICLE
		Element supplier_aid = document.createElement("SUPPLIER_AID");
		supplier_aid.insertBefore(document.createTextNode(product.getOrderNumberSupplier()), supplier_aid.getLastChild());
		article.appendChild(supplier_aid);
		
		//Create ARTICLE_DETAILS-Element and append it to ARTICLE
		Element article_details = document.createElement("ARTICLE_DETAILS");
		article.appendChild(article_details);
		
		//Create DESCRIPTION_SHORT-Element, insert content and append it to "ARTICLE_DETAILS"
		Element description_short = document.createElement("DESCRIPTION_SHORT");
		description_short.insertBefore(document.createTextNode(product.getShortDescription()), description_short.getLastChild());
		article_details.appendChild(description_short);
		
		//Create DESCRIPTION_LONG-Element, insert content and append it to ARTICLE_DETAILS
		Element description_long = document.createElement("DESCRIPTION_LONG");
		description_long.insertBefore(document.createTextNode(product.getLongDescription()), description_long.getLastChild());
		article_details.appendChild(description_long);
		
		//Create ARTICLE_ORDER_DETAILS-Element and append it to ARTICLE
		Element article_order_details = document.createElement("ARTICLE_ORDER_DETAILS");
		article.appendChild(article_order_details);
		
		//Create ORDER_UNIT-Element
		Element order_unit = document.createElement("ORDER_UNIT");
		//Insert content for ORDER_UNIT --> Text Content has to be a valid value of a given enumeration
		order_unit.insertBefore(document.createTextNode("05"), order_unit.getLastChild());
		//Append ORDER_UNIT to "ARTICLE_ORDER_DETAILS"
		article_order_details.appendChild(order_unit);
		
		//Create CONTENT_UNIT-Element
		Element content_unit = document.createElement("CONTENT_UNIT");
		//Insert content for CONTENT_UNIT --> Text Content has to be a valid value of a given enumeration
		content_unit.insertBefore(document.createTextNode("05"), content_unit.getLastChild());
		//Append CONTENT_UNIT to "ARTICLE_ORDER_DETAILS"
		article_order_details.appendChild(content_unit);
		
		//Create NO_CU_PER_OU-Element
		Element no_cu_per_ou = document.createElement("NO_CU_PER_OU");
		//Insert content for NO_CU_PER_OU --> Text Content has to be a valid value of a given enumeration
		no_cu_per_ou.insertBefore(document.createTextNode("05"), no_cu_per_ou.getLastChild());
		//Append NO_CU_PER_OU to "ARTICLE_ORDER_DETAILS"
		article_order_details.appendChild(no_cu_per_ou);
		
		//Create ARTICLE_DETAILS-Element and append it to ARTICLE
		Element article_price_details = document.createElement("ARTICLE_PRICE_DETAILS");
		article.appendChild(article_price_details);
			
		appendArticlePriceDetails(document, article_price_details, product);
	}
	

	
	/**
	 * Appends the "ARTICLE_PRICE_DETAILS" to an article
	 * @param document DOM 
	 * @param element "ARTICLE_PRICE_DETAILS" Element
	 * @param product BOProduct, needed to get the Sales Prices from the Database
	 */
	public static void appendArticlePriceDetails(Document document, Element element, BOProduct product){
		Element article_price_details = element;
		List<BOSalesPrice> sales_price = product.getSalesPrices();
		
		for(BOSalesPrice salePrice : sales_price){
			//Create ARICLE_PRICE-Element
			Element article_price = document.createElement("ARTICLE_PRICE");
			//Set the Attribute
			article_price.setAttribute("price_type", salePrice.getPricetype());
			//Append ARTICLE_PRICE-ELEMENT to ARTICLE_PRICE_DETAILS
			article_price_details.appendChild(article_price);
			
			//Create PRICE_AMOUNT-Element 
			Element price_amount = document.createElement("PRICE_AMOUNT");
			//Append PRICE_AMOUNT-Element to ARTICLE_PRICE
			article_price.appendChild(price_amount);
			//Inserts Price
			price_amount.insertBefore(document.createTextNode(salePrice.getAmount().toString()), price_amount.getLastChild());		
			
			//Create PRICE_CURRENCY-Element
			Element price_currency = document.createElement("PRICE_CURRENCY");
			//Append PRICE_CURRENCY to ARTICLE_PRICE
			article_price.appendChild(price_currency);
			//Inserts Currency
			price_currency.insertBefore(document.createTextNode(salePrice.getCountry().getCurrency().getCode()), price_currency.getLastChild());
			
			//Create TAX-Element
			Element tax = document.createElement("TAX");
			//Append TAX-Element to ARTICLE_PRICE
			article_price.appendChild(tax);
			//Insert TAX
			tax.insertBefore(document.createTextNode(salePrice.getTaxrate().toString()), tax.getLastChild());
			
			//Create TERRITORY-Element
			Element territory = document.createElement("TERRITORY");
			//Append TERRITORY-Element to ARTICLE_PRICE
			article_price.appendChild(territory);
			//Insert TERRITORY
			territory.insertBefore(document.createTextNode(salePrice.getCountry().getIsocode()), territory.getLastChild());
		}
	}

	//Not used at this time ! 
	public boolean validateDOM(Document document, ArrayList<String> errorList) {
		boolean isValid = false;
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Validator validator = null;
		Schema bmecat = null;
		try {
			bmecat = schemaFactory.newSchema(new File("/Users/mertcipan/EBUT/WholesalerWebDemo/schemaFiles/stylesheet.xsd"));
			validator = bmecat.newValidator();
			//Validate DOM
			validator.validate(new DOMSource(document)); //if the validation fails an exception is thrown
			isValid = true;
		} catch (SAXException e) {
			errorList.add("The Uploaded XML File is not valid!");
			e.printStackTrace();
		} catch (IOException e) {
			errorList.add("Error while reading DOM");
			e.printStackTrace();
		} 		
		return isValid;
	}
}