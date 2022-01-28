DROP TABLE IF EXISTS ABONNE ; 
CREATE TABLE ABONNE (
    Nom CHAR(30)  NOT NULL,
    Ville CHAR(20),
     Tel NUMERIC(13),
    Gmail CHAR(30), 
    NumCNI CHAR(30),
    PRIMARY KEY (Nom)) ENGINE=InnoDB; 


DROP TABLE IF EXISTS RAYON ;

CREATE TABLE RAYON (
      Sale CHAR(15)  NOT NULL,
     Etagere CHAR(15),
      Section CHAR(20),
      PRIMARY KEY (Sale)) ENGINE=InnoDB; 

DROP TABLE IF EXISTS OUVRAGE ;

 CREATE TABLE OUVRAGE (
     ID_Librairie CHAR(20)  NOT NULL, 
     PRIMARY KEY (ID_Librairie)) ENGINE=InnoDB;

DROP TABLE IF EXISTS LIVRE ; 

CREATE TABLE LIVRE (
     CodeBar CHAR(30)  NOT NULL,
     Nom CHAR(30),
     DateAcquisition DATE,
      DatePrevue DATE,
     Sale CHAR(30),
     ID_Librairie CHAR(30),
     PRIMARY KEY (CodeBar),
     FOREIGN KEY (sale) REFERENCES RAYON (Sale),
     FOREIGN KEY (ID_Librairie) REFERENCES OUVRAGE (ID_Librairie) ) ENGINE=InnoDB;

 DROP TABLE IF EXISTS TYPES; 

    CREATE TABLE TYPES (
    Types CHAR(20)  NOT NULL, 
    PRIMARY KEY (Types)) ENGINE=InnoDB; 

 DROP TABLE IF EXISTS MOT_CLE ; 

 CREATE TABLE MOT_CLE (
     Libelle CHAR(20)  NOT NULL, 
     Types CHAR(20),
 PRIMARY KEY (Libelle),
  FOREIGN KEY (Types) REFERENCES TYPES (Types)) ENGINE=InnoDB; 
 


DROP TABLE IF EXISTS Emprunter ; 

CREATE TABLE Emprunter (
    Nom CHAR(30)  NOT NULL, 
    CodeBar CHAR(30) NOT NULL, 
    DateRetour DATE, 
    PRIMARY KEY (Nom,  CodeBar),
    FOREIGN KEY (Nom) REFERENCES ABONNE (Nom),
    FOREIGN KEY (CodeBar) REFERENCES LIVRE (CodeBar)) ENGINE=InnoDB; 

DROP TABLE IF EXISTS Ref_Ouvrage ; 

CREATE TABLE Ref_Ouvrage (
    ID_Librairie CHAR(20)  NOT NULL, 
    Libelle CHAR(20) NOT NULL, 
    PRIMARY KEY (ID_Librairie,  Libelle),
    FOREIGN KEY (ID_Librairie) REFERENCES OUVRAGE (ID_Librairie),
    FOREIGN KEY (Libelle) REFERENCES MOT_CLE (Libelle)) ENGINE=InnoDB; 

