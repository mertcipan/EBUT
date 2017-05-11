/usr/local/mysql/bin/mysqladmin --host=localhost --user=$2 --password=$3 drop $1 -f
/usr/local/mysql/bin/mysqladmin --host=localhost --user=$2 --password=$3 create $1 -f
/usr/local/mysql/bin/mysql --host=localhost --user=$2 --password=$3 --database=$1 < /Users/mertcipan/Studium/07_Semester/EBUT/02_Übung/3_Aufgabe/WholesalerWebDemo/install/ebus.sql
