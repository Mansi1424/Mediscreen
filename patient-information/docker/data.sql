CREATE DATABASE IF NOT EXISTS PATIENT_DB;


USE PATIENT_DB;

CREATE TABLE patients(
    patient_id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    family_name VARCHAR(255) NOT NULL,
    DOB VARCHAR(255) NOT NULL,
    sex VARCHAR(255) NOT NULL,
    home_address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    PRIMARY KEY(patient_id)

);

INSERT INTO patients(name, family_name, DOB, sex, home_address, phone_number) VALUES ("John", "Smith", "02-20-1994", "Male", "Talwood lane", "900-850-2222");

