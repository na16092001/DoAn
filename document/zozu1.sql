create database zozu1
go
USE zozu1
go
create table tbl_Category
(
	id int identity primary key,
	groupFood nvarchar(200) not null,
	status_cat bit
)
go
create table tbl_Food
(
	id int identity primary key,
	foodname nvarchar(200) not null unique,
	image_food text ,
	price_entry float not null,
	price_selling float not null,
	status_food bit,
	date_food date,
	id_Category int,
	foreign key (id_Category) references tbl_Category(id)
)
go
create table tbl_Customer
(
	id int identity primary key,
	name nvarchar(200) not null unique,
	phone nvarchar(20) not null unique,
	address nvarchar(200),
	status_customer bit
)
go
create table tbl_Business(
	id int identity primary key,
	name nvarchar(200),
	status_Busines bit
)
go
create table tbl_Employees
(
	id int identity primary key,
	name nvarchar(200) not null unique,
	phone nvarchar(200) not null unique,
	email nvarchar(200) not null,
	address nvarchar(200) ,
	gender bit default (0) ,
	id_Busines int not null ,
	status_Employes bit,
	created_date date,
	foreign key (id_Busines) references tbl_Business(id)
)
go
create table tbl_DiningTable(
	id int primary key,
	name nvarchar(200),
	status_dining bit 
)
go
create table tbl_Bill
(
	id int identity primary key,
	id_Cus int,
	created_date date,
	total_money float,
	id_Employes int,
	id_dining int,
	foreign key (id_Cus) references tbl_Customer(id),
	foreign key (id_Employes) references tbl_Employees(id),
	foreign key (id_dining) references tbl_DiningTable(id)
)
go
create table tbl_BillDetail(
	id_bill int,
	id_food int,
	quantity int,
	created_date date 
	foreign key (id_bill) references tbl_Bill(id),
	foreign key (id_food) references tbl_Food(id)
)
go