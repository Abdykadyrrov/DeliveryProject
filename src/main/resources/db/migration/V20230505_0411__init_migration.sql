create table person
(
    id       bigserial
        primary key,
    password varchar(255),
    role     varchar(255),
    username varchar(255)
);

alter table person
    owner to postgres;

create table trainers
(
    id          bigint           not null
        primary key,
    description varchar(255),
    gender      varchar(255),
    image       varchar(255),
    price       double precision not null,
    title       varchar(255)
);

alter table trainers
    owner to postgres;

