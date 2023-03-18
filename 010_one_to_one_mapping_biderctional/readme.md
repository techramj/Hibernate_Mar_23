Hibernate: create sequence emp_seq start with 1 increment by  50
Hibernate: 
    
    create table emp_parent_address (
       Employee_id number(10,0) not null,
        city varchar2(255 char),
        pin_code varchar2(255 char),
        relation varchar2(255 char)
    )
Hibernate: 
    
    create table emp_skill (
       Employee_id number(10,0) not null,
        skills varchar2(255 char)
    )
Hibernate: 
    
    create table Employee (
       id number(10,0) not null,
        name varchar2(255 char),
        salary double precision not null,
        primary key (id)
    )
Hibernate: 
    
    create table projects (
       Employee_id number(10,0) not null,
        projects varchar2(255 char)
    )
Hibernate: 
    
    alter table emp_parent_address 
       add constraint FKmoqx71bwvtigdp4ssh6f8in06 
       foreign key (Employee_id) 
       references Employee
Hibernate: 
    
    alter table emp_skill 
       add constraint FKq3yhf2pkxc1xvx30k81inuuub 
       foreign key (Employee_id) 
       references Employee
Hibernate: 
    
    alter table projects 
       add constraint FKo4p51mxhpaln0pgjbxvfqlafn 
       foreign key (Employee_id) 
       references Employee
       
    insert 
    into
        Employee
        (name, salary, id) 
    values
        (?, ?, ?)
        
Hibernate: 
    select
        emp_seq.nextval 
    from
        dual
Hibernate: 
    insert 
    into
        projects
        (Employee_id, projects) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        projects
        (Employee_id, projects) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        emp_skill
        (Employee_id, skills) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        emp_skill
        (Employee_id, skills) 
    values
        (?, ?)
Hibernate: 
    insert 
    into
        emp_skill
        (Employee_id, skills) 
    values
        (?, ?)       
