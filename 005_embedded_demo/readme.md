Hibernate: create sequence emp_seq start with 1 increment by  50

create table Employee (
       id number(10,0) not null,
        city varchar2(255 char),
        pinCode varchar2(255 char),
        name varchar2(255 char),
        salary double precision not null,
        primary key (id)
    );
    
 Hibernate: 
    select
        emp_seq.nextval 
    from
        dual
Hibernate: 
    insert 
    into
        Employee
        (city, pinCode, name, salary, id) 
    values
        (?, ?, ?, ?, ?)
 