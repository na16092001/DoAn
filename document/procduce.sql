-- nghiệp vụ
go
create proc proc_getAllBusiness as select *from tbl_Business
go
create proc proc_getIdBusiness @id int as select *from tbl_Business where id=@id
go
create proc proc_insertBusiness
@name nvarchar(200),
@status_Busines bit
as insert into tbl_Business(name,status_Busines) values(@name,@status_Busines)
go
create proc proc_UpdateBusiness
@name nvarchar(200),
@status_Busines bit,
@id int
as update tbl_Business set name=@name,status_Busines=@status_Busines where id=@id
go
create proc proc_DeleteBusiness @id int as delete tbl_Business where id=@id
go
--/ thêm dữ liệu vào bảng 
insert into tbl_Business (name,status_Busines) values (N'Tiếp tân',0)
insert into tbl_Business (name,status_Busines) values (N'Thu Ngân',0)
-- nhân viên
go
create view	vw_Employees as 
Select tbl_Employees.id,tbl_Employees.name,tbl_Employees.phone,tbl_Employees.email,tbl_Employees.address,tbl_Employees.gender,tbl_Employees.status_Employes,tbl_Business.name as 'Bussiness'from tbl_Employees
Join tbl_Business on tbl_Employees.id_Busines=tbl_Business.id
go
create proc proc_getAllEmployes as select *from vw_Employees 
go

create proc proc_getAllEmployes1 as select *from tbl_Employees
go
go
create proc proc_getByNameEmployes @name nvarchar(200) as select * from tbl_Employees where name like @name
go
create proc proc_insertEmployes 
@name nvarchar(200),
@phone nvarchar(200),
@email nvarchar(200),
@address nvarchar(200) ,
@password nvarchar(200),
@gender bit ,
@id_Busines int ,
@status_Employes bit
as insert into tbl_Employees(name,phone,email,address,password,gender,id_Busines,status_Employes) values(@name,@phone,@email,@address,@password,@gender,@id_Busines,@status_Employes)
go

insert into tbl_Employees(name,phone,email,address,password,gender,id_Busines,status_Employes) values(N'đạo',0987723632,'ghshs@fgags',N'hoàng quốc việt',N'1234',1,1,0)
go
create proc proc_updateEmployes
@id int,
@name nvarchar(200),
@phone nvarchar(200),
@email nvarchar(200),
@address nvarchar(200) ,
@gender bit ,
@id_Busines int ,
@status_Employes bit
as update tbl_Employees set name=@name,phone=@phone,email=@email,address=@address,gender=@gender,id_Busines=@id_Busines,status_Employes=@status_Employes
where id=@id
go
create proc proc_DeleteEmployes @id int as delete tbl_Employees where id=@id

-- Danh mục
<<<<<<< HEAD
go
create proc proc_InsertCategory
@groupFood nvarchar(200),
@status_cat bit
as
Insert into tbl_Category(groupFood,status_cat)values(@groupFood,@status_cat)
go
create proc proc_UpdateCategory
@id int,
@groupFood nvarchar(200),
@status_cat bit
as update tbl_Category set groupFood=@groupFood,status_cat=@status_cat where id=@id
go
create proc proc_DeleteCategory
@id int
as 
Delete tbl_Category where id=@id

-- Food
go
create proc proc_InsertFood
@foodname nvarchar(200),
@image_food text ,
@price_entry float ,
@price_selling float,
@status_food bit,
@date_food date,
@id_Category int
as
Insert into tbl_Food(foodname, image_food, price_entry ,price_selling, status_food,date_food,id_Category ) values(@foodname,@image_food,@price_entry,@price_selling,@status_food,@date_food,@id_Category)
go
create proc proc_UpdateFood
@id int,
@foodname nvarchar(200),
@image_food text ,
@price_entry float ,
@price_selling float,
@status_food bit,
@date_food date,
@id_Category int
as
Update tbl_Food set foodname=@foodname, image_food=@image_food, price_entry=@price_entry ,price_selling=@price_selling, status_food=@status_food,date_food=@date_food,id_Category=@id_Category where id=@id
go
create proc proc_DeleteFood
@id int
as
Delete tbl_Food where id=@id 

-- customer
go

create proc proc_InsertCustomer
@name nvarchar(200) ,
@phone nvarchar(20),
@address nvarchar(200),
@status_customer bit
as
Insert into tbl_Customer(name,phone,address,status_customer)values(@name,@phone,@address,@status_customer)
go
create proc proc_UpdateCustomer
@id int,
@name nvarchar(200) ,
@phone nvarchar(20),
@address nvarchar(200),
@status_customer bit
as
Update tbl_Customer set name=@name,phone=@phone,address=@address,status_customer=@status_customer where id=@id
go
create proc proc_DeleteCustomer
@id int
as
Delete tbl_Customer where id=@id

-- DiningTable
go
create proc proc_InsertDining
@name nvarchar(200),
@status_dining bit
as
Insert into tbl_DiningTable(name,status_dining)values(@name,@status_dining)
go
create proc proc_UpdateDining
@id int,
@name nvarchar(200),
@status_dining bit
as
Update tbl_DiningTable set name=@name,status_dining=@status_dining where id=@id
go
create proc proc_DeleteDining
@id int
as
Delete tbl_DiningTable where id=@id

-- Bill
go
create proc proc_InsertBill
@created_date date,
@total_money float,
@id_Employes int,
@id_dining int
as
Insert into tbl_Bill(created_date,total_money,id_Employes,id_dining)values(@created_date,@total_money,@id_Employes,@id_dining)
go
create proc proc_UpdateBill
@id int,
@created_date date,
@total_money float,
@id_Employes int,
@id_dining int
as
Update tbl_Bill set created_date=@created_date,total_money=@total_money,id_Employes=@id_Employes,id_dining=@id_dining where id=@id
go 
create proc proc_DeleteBill
@id int
as
Delete tbl_Bill where id=@id

-- BillDetail
go
create proc proc_InsertBillDetail
@id_bill int,
@id_food int,
@quantity int,
@created_date date	
as
Insert into tbl_BillDetail(id_bill,id_food,quantity,created_date)values(@id_bill,@id_food,@quantity,@created_date)
go
create proc proc_UpdateBillDetail
@id_bill int,
@id_food int,
@quantity int,
@created_date date	
as
Update tbl_BillDetail set id_food=@id_food,quantity=@quantity,created_date=@created_date where id_bill=@id_bill
go
create proc proc_DeleteBillDetail
@id_bill int
as
Delete tbl_BillDetail where id_bill=@id_bill
=======
go
create proc proc_getAllCategory
as
select * from tbl_Category
go
create proc proc_InsertCategory
@groupFood nvarchar(200),
@status_cat bit
as
Insert into tbl_Category(groupFood,status_cat)values(@groupFood,@status_cat)

go
create proc proc_UpdateCategory

@groupFood nvarchar(200),
@status_cat bit,
@id int
as update tbl_Category set groupFood=@groupFood,status_cat=@status_cat where id=@id

go
create proc proc_DeleteCategory
@id int
as 
Delete tbl_Category where id=@id


select*from tbl_Category
select * from tbl_Business
>>>>>>> ce8d1bc850ee25b55fbbfe8e37d1a2797f7ade2c
