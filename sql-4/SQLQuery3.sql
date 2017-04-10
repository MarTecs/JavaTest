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
	ssex char(2) check( ssex in('��','Ů')),
	scard char(18),
	sdate smalldatetime check (sdate between '2010-1-1' and getdate()),
	sheight decimal(3,2) check (sheight>=1.00 and sheight<=2.40),
	saddress varchar(50) default('��ַ����'),
	sstatus int check( sstatus in(-1,0,1)),

)
go
insert into classes values('s56')
insert into classes values('s58')
insert into classes values('s59')
go

insert into student values(1,'������','��','123456123456123456','2015-1-11',1.7,null,1)
insert into student values(1,'����','��','123456123456123486','2014-11-11',1.77,'��������',1)
insert into student values(1,'������','��','123456123456123456','2012-1-21',1.67,'��������',1)
insert into student values(2,'����','Ů','123456123456123496','2011-7-11',1.7,'��������',0)
insert into student values(2,'��С��','Ů','123456123456123656','2011-8-11',1.47,'�����»�',1)
insert into student values(3,'������','Ů','123456123458123456','2014-1-11',1.37,'���ϳ�ɳ',1)
insert into student values(3,'��ǿ','Ů','223456123456163456','2011-1-11',1.27,'�����人',-1)
insert into student values(3,'��һ��','Ů','123456123456123486',null,1.67,'��������',1)
go

select * from classes;
select * from student;


--��ѯ select 

-- ���ֶ��������(ͶӰ)
select sname,ssex from student;

-- ���������
select sname as '����',ssex as '�Ա�' from student;
select sname  '����',ssex  '�Ա�' from student;
select sname ����,ssex �Ա� from student;

-- ��������� where 
select * from student where ssex='��'  --��ѯ���������������Ϣ
select * from student where ssex='��' and sheight>=1.7  --��ѯ�����ߴ���1.7��������������Ϣ
select * from student where ssex='��' or sheight>=1.7  --��ѯ�����ߴ���1.7���Ա�Ϊ������ѧ����Ϣ
--��ѯ���2012����ѧ������ѧ����Ϣ
select * from student where sdate between '2012-1-1' and '2012-12-31 23:59:59'
select * from student where 1=1
select * from student where 1=0
--��ֵ��ѯ  is null
select * from student where saddress is null      --���ַΪ�յ�ѧ����Ϣ
select * from student where saddress is not null


--����  order by (Ĭ��������  asc ),ֻ��д�� where ����

select * from student order by  sheight;
select * from student order by  sheight asc;
select * from student order by  sheight desc;

select * from student  where ssex='Ů' order by  sheight desc 

select * from student order by  sheight desc,sdate asc;  --���ιؽ�������

-- ģ����ѯ like  
/*
	 % ͨ�������ַ�  (0-n)
	 _ ͨ������һ���ַ�  1

*/

select * from student where sname='������'  --��׼��ѯ
select * from student where sname like '������'  --

select * from student where sname like '��%'  -- ��  �ŵ�
select * from student where sname like '��_'  --��  �ŵ�  �����Ƕ�����
select * from student where sname like '%��%'  --�������� ������


-- ���� ��ѯ  top  ֻ��д�� select ����
-- ����ȫ�ļ�������߲�ѯ���ٶȣ�


select top 2 * from student where ssex='��'
--�ҳ� �����ߵ�����
select top 1 * from student where ssex='��' order by sheight desc;
--�ҳ� ������ѧ��ѧ��
select top 1 * from student where sdate is not null order by sdate;

--�û���¼

select  *  from userinfo where username='admin' and password='admin'
select  top 1 *  from userinfo where username='admin' and password='admin' --����ȫ�ļ���


-- ���� �ۺϺ����Ĳ�ѯ,ֻ����һ��ֵ


	SUM()  ��� COUNT() ͳ�Ƹ���    MAX() �����ֵ  MIN()  ����Сֵ    AVG()��ƽ��ֵ 


	select AVG(sheight) from student;  --��ƽ�����
    select top 1 * from student where ssex='��' order by sheight desc;  --
	select * from student where sheight=(select max(sheight) from student where ssex='��');
		select sname from student where ssex='��';




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
