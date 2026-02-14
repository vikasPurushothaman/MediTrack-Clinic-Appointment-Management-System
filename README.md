🏥 MediTrack – Clinic Appointment Management System

A Core Java (OOP-based) Clinic Appointment & Billing Management System designed to simulate real-world hospital workflow using clean architecture and design patterns.

This project demonstrates strong understanding of:

Object-Oriented Programming (OOP)

Design Patterns

Clean Code Structure

Real-world Entity Modeling

📌 Project Overview

MediTrack allows:

👨‍⚕️ Doctor creation with specialization & consultation fee

🧑‍🤝‍🧑 Patient registration

📅 Appointment scheduling & confirmation

💰 Bill calculation based on consultation fee

🆔 Unique ID generation using Singleton pattern

| Concept            | Implementation                                   |
| ------------------ | ------------------------------------------------ |
| Encapsulation      | Private fields with getters/setters              |
| Abstraction        | Entity separation (Doctor, Patient, Appointment) |
| Composition        | Appointment contains Doctor & Patient            |
| Enum               | Specialization enum                              |
| Singleton          | IdGenerator class                                |
| Clean Architecture | Organized entity package                         |
com.airtribe.meditrack/
│
├── Main.java
│
└── entity/
├── Doctor.java
├── Patient.java
├── Appointment.java
├── Bill.java
├── IdGenerator.java
└── Specialization.java

📦 Core Modules
👨‍⚕️ Doctor

id

name

age

specialization (Enum)

consultationFee

🧑‍🦱 Patient

id

name

age

symptoms/disease

📅 Appointment

Links Doctor and Patient

Confirm appointment

Display appointment details

💰 Bill

Calculates final amount

Easily extendable (tax, discount, etc.)

🆔 IdGenerator (Singleton Pattern)

Ensures unique incremental ID

Only one instance allowed

▶️ How to Run

Install Java 8+

Open project in IntelliJ / Eclipse

Navigate to Main.java

Run the application

Appointment Confirmed Successfully
----- Appointment Details -----
Doctor: Vimal Kumar pp
Patient: Vikas p
Status: Confirmed

Vikas p
Final Bill: 2000

Thank you 
