
create table if not exists celebrities (
    celebrity_id integer not null primary key auto_increment,
    name varchar(20),
    gender varchar(20)
);

create table if not exists images (
    image_name varchar(30) not null primary key,
    celebrity_id integer,
    foreign key(celebrity_id) references celebrities(celebrity_id) on delete set null
)
