--liquibase formatted sql

--changeset Kaio:1

CREATE TABLE public.user (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL
);

--rollback DROP TABLE public.user;

--changeset Kaio:2

CREATE TABLE public.list (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(255) NOT NULL,
    user_id BIGINT NOT NULL
);

ALTER TABLE public.list
    ADD CONSTRAINT pk_list_id PRIMARY KEY (id);

ALTER TABLE public.list
    ADD CONSTRAINT fk_list_user
    FOREIGN KEY (user_id)
    REFERENCES public.user(id);

--rollback DROP TABLE public.list;

--changeset Kaio:3

CREATE TABLE public.item (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    description VARCHAR(255) NOT NULL,
    checked BOOLEAN NOT NULL DEFAULT FALSE,
    list_id BIGINT NOT NULL
);

ALTER TABLE public.item
    ADD CONSTRAINT pk_item_id PRIMARY KEY (id);

ALTER TABLE public.item
    ADD CONSTRAINT fk_item_list
    FOREIGN KEY (list_id)
    REFERENCES public.list(id);

--rollback DROP TABLE public.item;