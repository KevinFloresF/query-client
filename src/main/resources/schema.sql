CREATE TABLE Client (
  clientId    NUMBER PRIMARY KEY ,
  name     VARCHAR(64) ,
  type_document   VARCHAR(64) ,
  number_document     VARCHAR(64),
  datebirth VARCHAR(64));

CREATE TABLE Plan (
  planId    NUMBER PRIMARY KEY ,
  name     VARCHAR(64) ,
  price  NUMBER );

  CREATE TABLE Mobile (
    mobileId    NUMBER PRIMARY KEY ,
    number     VARCHAR(64) ,
    state   VARCHAR(64) ,
    type     VARCHAR(64),
    planFk NUMBER,
    FOREIGN KEY(planFk) references plan(planId));


CREATE TABLE Ofert (
  OfertId    NUMBER PRIMARY KEY ,
  code     VARCHAR(64) ,
  description   VARCHAR(64) ,
  begin_date    VARCHAR(64),
  end_date  VARCHAR(64));

  CREATE TABLE Client_Mobile (
clientFk NUMBER,
mobileFk NUMBER,
  FOREIGN KEY(clientFk) references Client(clientId),
    FOREIGN KEY(mobileFk) references Mobile(mobileId));


  CREATE TABLE Ofert_Mobile (
mobileFk NUMBER,
ofertFk NUMBER,
FOREIGN KEY(mobileFk) references Mobile(mobileId),
 FOREIGN KEY(ofertFk) references Ofert(ofertId));
