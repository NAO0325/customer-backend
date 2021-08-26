/************ Add: Sequences ***************/
CREATE SEQUENCE User_System_iduser_seq INCREMENT BY 1;
COMMENT ON SEQUENCE User_System_iduser_seq IS 'Secuencia para llave primaria autoincremental.';

CREATE SEQUENCE Customer_Type_idtype_seq INCREMENT BY 1;
COMMENT ON SEQUENCE Customer_Type_idtype_seq IS 'Secuencia para llave primaria autoincremental.';

CREATE SEQUENCE Customer_idcustomer_seq INCREMENT BY 1;
COMMENT ON SEQUENCE Customer_idcustomer_seq IS 'Secuencia para llave primaria autoincremental.';

/******************** Add Table: User_System ************************/

/* Build Table Structure */
CREATE TABLE User_System
(
	iduser BIGINT DEFAULT nextval('public.User_System_iduser_seq'::regclass) NOT NULL,
	login VARCHAR NOT NULL,
	password TEXT NOT NULL
);

/* Add Primary Key */
ALTER TABLE User_System ADD CONSTRAINT pkUserSystem
	PRIMARY KEY (iduser);

/* Add Comments */
COMMENT ON COLUMN User_System.iduser IS 'Llave primaria';

COMMENT ON COLUMN User_System.login IS 'Login de un usuario';

COMMENT ON COLUMN User_System.password IS 'Clave de un usuario';

/******************** Add Table: Customer_Type ************************/

/* Build Table Structure */
CREATE TABLE Customer_Type
(
	idtype BIGINT DEFAULT nextval('public.Customer_Type_idtype_seq'::regclass) NOT NULL,
	type_name VARCHAR NOT NULL
);

/* Add Primary Key */
ALTER TABLE Customer_Type ADD CONSTRAINT pkCustomerType
	PRIMARY KEY (idtype);

/* Add Comments */
COMMENT ON COLUMN Customer_Type.idtype IS 'Llave primaria';

COMMENT ON COLUMN Customer_Type.type_name IS 'Tipo de cliente';

/******************** Add Table: Customer ************************/

/* Build Table Structure */
CREATE TABLE Customer
(
	idcustomer BIGINT DEFAULT nextval('public.Customer_idcustomer_seq'::regclass) NOT NULL,
        idtype BIGINT NOT NULL,
	dni VARCHAR NOT NULL,
        customer_name VARCHAR NOT NULL,
        contact VARCHAR NOT NULL,
        region VARCHAR NOT NULL
);

/* Add Primary Key */
ALTER TABLE Customer ADD CONSTRAINT pkCustomer
	PRIMARY KEY (idcustomer);

/* Add Foreign Key */
ALTER TABLE Customer ADD FOREIGN KEY (idtype) REFERENCES Customer_Type (idtype) ON UPDATE RESTRICT ON DELETE RESTRICT;

/* Add Comments */
COMMENT ON COLUMN Customer.idcustomer IS 'Llave primaria';

COMMENT ON COLUMN Customer.idtype IS 'Tipo de cliente';

COMMENT ON COLUMN Customer.dni IS 'Identificacion del cliente';

COMMENT ON COLUMN Customer.customer_name IS 'Razon social del cliente';

COMMENT ON COLUMN Customer.contact IS 'Contacto del cliente';

COMMENT ON COLUMN Customer.region IS 'Region del cliente';
