create table user(
                     id int not null primary key auto_increment,
                     username varchar(32) not null ,
                     password varchar(64) not null ,
                     role int not null default 1
);