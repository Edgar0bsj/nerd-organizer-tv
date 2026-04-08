-- Séries
INSERT INTO serie (id, title, gender)
VALUES ('e5d77d4f-b792-493d-8ebf-80d2068e9457', 'Stranger Things', 'ACTION');

INSERT INTO serie (id, title, gender)
VALUES ('0e9c8cc7-6569-4032-8358-0bb8556d9e74', 'The Last of Us', 'COMEDY');

-- Temporadas de Stranger Things
INSERT INTO season (id, season, assisted, serie_id)
VALUES ('9527cd0f-4e8f-4ef0-91c9-ea380b381d4d', 1, FALSE,'e5d77d4f-b792-493d-8ebf-80d2068e9457');

INSERT INTO season (id, season, assisted, serie_id)
VALUES ('955e47f0-0e6c-4621-919a-8ccb2bc64fd0', 2, FALSE,'e5d77d4f-b792-493d-8ebf-80d2068e9457');

-- Temporadas de The Last of Us
INSERT INTO season (id, season, assisted, serie_id)
VALUES ('ccc92d99-77f7-4cdd-8264-422535f131c3', 1, TRUE,'0e9c8cc7-6569-4032-8358-0bb8556d9e74');

INSERT INTO season (id, season, assisted, serie_id)
VALUES ('c844a6cd-04ff-4908-9626-46f21a2de6b7', 2, FALSE,'0e9c8cc7-6569-4032-8358-0bb8556d9e74');