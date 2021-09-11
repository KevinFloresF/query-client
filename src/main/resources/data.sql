INSERT INTO Client (clientId, name, type_document,number_document,datebirth) VALUES
  (1,'Kevin1', 'DNI', '71980004','1995-01-29'),
  (2,'Kevin2', 'DNI', '71000002','1995-01-29'),
  (3,'Kevin3', 'DNI','71000003','1996-03-02');

INSERT INTO Plan (planId,name,price) VALUES
     (1,'Plan Prepago',null),
    (2,'Plan 29.90',29.0),
    (3,'Plan 39.90',39.0);
 INSERT INTO Mobile (mobileId, number,state,type,planFk,clientFk) VALUES
    (1,930029222, 1 , 'PostPago',2,1),
    (2,991423542,1 , 'PostPago',3,1),
    (3,998400000, 0 , 'PostPago',3,1),
    (4,990000015, 1 , 'PostPago',3,1),
    (5,990400325, 1,'PostPago',3,2),
    (6,990034015, 1, 'PostPago',3,2),
    (7,990003334, 0 , 'PostPago',3,2),
    (8,990000235, 1 , 'Prepago',1,3);

INSERT INTO Ofert (ofertId ,code,description,begin_date,end_date) VALUES
    (1,'O001','Promoción Datos ','2021-09-01 08:00:01','2021-09-30 08:00:01'),
    (2,'O001','Promoción Llamadas','2021-09-02 08:00:01','2021-09-29 08:00:01'),
    (3,'O001','Promoción SMS','2021-09-03 08:00:01','2021-09-27 08:00:01'),
    (4,'O001','Promoción Facebook Vence Mñn','2021-09-04 08:00:01','2021-09-11 08:00:01'),
    (5,'O002','Promoción Tiktok Gratis','2021-09-09 08:00:01','2021-09-12 08:00:01');


 INSERT INTO Ofert_Mobile (mobileFk,ofertFk) VALUES
     (1,1),
     (1,4),
     (2,1),
     (3,1),
     (5,3),
     (6,4),
     (7,5);

