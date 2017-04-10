use  master;
go

create database s59;
go

use  s59
go

create table classes
(
	cid int identity primary key,
	cname varchar(50) unique not null
)
go

create table student
(
	sid int identity(1000,1) primary key,
	cid int foreign key references classes(cid),
	sname varchar(50) no    t null,
	ssex char(2) check( ssex in('男','女')),
	scard char(18),
	sdate smalldatetime check (sdate between '2010-1-1' and getdate()),
	sheight decimal(3,2) check (sheight>=1.00 and sheight<=2.40),
	saddress varchar(50) default('地址不详'),
	sstatus int check( sstatus in(-1,0,1)),

)
go
insert into classes values('s56')
insert into classes values('s58')
insert into classes values('s59')
go

insert into student values(1,'张三中','男','123456123456123456','2015-1-11',1.7,null,1)
insert into student values(1,'张三','男','123456123456123486','2014-11-11',1.77,'湖南岳阳',1)
insert into student values(1,'张三丰','男','123456123456123456','2012-1-21',1.67,'湖南株洲',1)
insert into student values(2,'李四','女','123456123456123496','2011-7-11',1.7,'湖南株洲',0)
insert into student values(2,'李小龙','女','123456123456123656','2011-8-11',1.47,'湖南新化',1)
insert into student values(3,'张无忆','女','123456123458123456','2014-1-11',1.37,'湖南长沙',1)
insert into student values(3,'胡强','女','223456123456163456','2011-1-11',1.27,'湖北武汉',-1)
insert into student values(3,'胡一刀','女','123456123456123486',null,1.67,'湖南株洲',1)
go

select * from classes;
select * from student;


--查询 select 

-- 按字段名表输出(投影)
select sname,ssex from student;

-- 按别名输出
select sname as '姓名',ssex as '性别' from student;
select sname  '姓名',ssex  '性别' from student;
select sname 姓名,ssex 性别 from student;

-- 按条件输出 where 
select * from student where ssex='男'  --查询输出所有男生的信息
select * from student where ssex='男' and sheight>=1.7  --查询输出身高大于1.7的所有男生的信息
select * from student where ssex='男' or sheight>=1.7  --查询输出身高大于1.7或性别为男生的学生信息
--查询输出2012年入学的所有学生信息
select * from student where sdate between '2012-1-1' and '2012-12-31 23:59:59'
select * from student where 1=1
select * from student where 1=0
--空值查询  is null
select * from student where saddress is null      --查地址为空的学生信息
select * from student where saddress is not null


--排序  order by (默认是升序  asc ),只能写在 where 后面

select * from student order by  sheight;
select * from student order by  sheight asc;
select * from student order by  sheight desc;

select * from student  where ssex='女' order by  sheight desc 

select * from student order by  sheight desc,sdate asc;  --主次关健字排序

-- 模糊查询 like  
/*
	 % 通配所有字符  (0-n)
	 _ 通配任意一个字符  1

*/

select * from student where sname='张三丰'  --精准查询
select * from student where sname like '张三丰'  --

select * from student where sname like '张%'  -- 姓  张的
select * from student where sname like '张_'  --姓  张的  名字是二个字
select * from student where sname like '%张%'  --名字里面 有张字


-- 限数 查询  top  只能写在 select 后面
-- 避免全文检索，提高查询的速度，


select top 2 * from student where ssex='男'
--找出 身高最高的男生
select top 1 * from student where ssex='男' order by sheight desc;
--找出 最早入学的学生
select top 1 * from student where sdate is not null order by sdate;

--用户登录

select  *  from userinfo where username='admin' and password='admin'
select  top 1 *  from userinfo where username='admin' and password='admin' --避免全文检索


-- 基于 聚合函数的查询,只返回一个值


	SUM()  求和 COUNT() 统计个数    MAX() 求最大值  MIN()  求最小值    AVG()求平均值 


	select AVG(sheight) from student;  --求平均身高
    select top 1 * from student where ssex='男' order by sheight desc;  --
	select * from student where sheight=(select max(sheight) from student where ssex='男');
		select sname from student where ssex='男';




create	table	classes
(
	cid int identity(1000,1) primary key,
	cname varchar(50) unique not null	
);

create	table	student
(
	sid	int identity(1000,1) primary key,
	cid int primary key,

	

);
