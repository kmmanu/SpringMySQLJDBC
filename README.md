SpringMySQLJDBC
===============

Sample program to connect to MySQL DB from Spring.    The project can be run from eclipse and Intellij.


Start MySQL
---------------

open cmd propmt - run as administrator

c:\Program Files\MySQL\MySQL Server 5.5\bin>mysqld



Create MySQL Schema and table using workbench
-----------------------------------------------
http://webvaultwiki.com.au/(S(iungfwenvz2f5c55pioeinil))/Default.aspx?Page=Create-Mysql-Database-User-Workbench&NS=&AspxAutoDetectCookieSupport=1


Create Table
-------------

CREATE TABLE `customer` (
  `CUST_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(100) NOT NULL,
  `AGE` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
