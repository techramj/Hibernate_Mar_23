Hibernate: create sequence emp_seq start with 1 increment by  50

create table Employee (
       id number(10,0) not null,
        mail_add_city varchar2(255 char),
        mail_add_pin_code varchar2(255 char),
        name varchar2(255 char),
        city varchar2(255 char),
        pin_code varchar2(255 char),
        salary double precision not null,
        primary key (id)
    )
    
    select
        emp_seq.nextval 
    from
        dual
Hibernate: 
    insert 
    into
        Employee
        (mail_add_city, mail_add_pin_code, name, city, pin_code, salary, id) 
    values
        (?, ?, ?, ?, ?, ?, ?)
 