-- 1) Create Database
CREATE DATABASE hospital;
USE hospital;

-- 2) Create user_login table
CREATE TABLE user_login (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

-- 3) Create doctor_record table
CREATE TABLE doctor_record (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    specialist VARCHAR(100) NOT NULL
);

-- 4) Create patient_record table
CREATE TABLE patient_record (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    disease VARCHAR(100) NOT NULL,
    date DATE NOT NULL,
    time TIME NOT NULL
);
