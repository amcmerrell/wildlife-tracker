# _Wildlife Tracker_

#### _Web application that allows users to report and view wildlife sightings, Java and PostgreSQL, Sep. 30, 2016_

#### By _**Andrew Merrell**_

## Description

_This web application intakes user data about wildlife sightings in their area to store and display data about endangered animals. It utilizes Java, PostgreSQL, Spark framework, Velocity Template Engine, and Gradle Build Tool._

## Setup/Installation Requirements

#### Initial Setup
* _Visit https://github.com/amcmerrell/wildlife-tracker to view files for this project._
* _Open your terminal application of choice and use "git clone https://github.com/amcmerrell/wildlife-tracker" in the command line._

#### Database Setup
_Start postgres in your terminal by entering "postgres", and in another tab, run "psql"._
_When psql is successfully running, use the following commands to set up the tables:_
* _CREATE DATABASE wildlife_tracker;_
* _\c wildlife_tracker;_
* _CREATE TABLE animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar, endangered boolean);_
* _CREATE TABLE sightings (id serial PRIMARY KEY, location varchar, dateTime timestamp, rangerName varchar, animalId int);_
* _CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;_

#### Running the Application
* _Navigate into the wildlife-tracker folder you created and use "gradle run" in the command line._
* _When that command gets to 75%, open a web browser and enter "localhost:4567."_

## Specifications
_Display a list of all animals that have been spotted in the area._
* _Example Behavior: Click "All Animals"._
* _Example Output: Racoon, Bear, Chipmunk._

_Display details for an animal, along with their sightings._
* _Example Behavior: Click on "Bear"._
* _Example Output: Display page with name and list of sightings._

_Add new animals to the database by completing a form._
* _Example Behavior: Submit form with name: Bear._
* _Example Output: Display "Bear" in list of animals._

_Add a new sighting to an animal._
* _Example Behavior: Submit form with location: NW Quadrant, animal: Bear,  ranger: Rick._
* _Example Output: Display Bear page with new sighting._

_If an endangered animal is spotted, users can store additional information about the animal._
* _Example Behavior: Enter additional fields in the animal form for health and age._
* _Example Output: Display animal detail page with additional info._

## Known Bugs
_There are currently no known bugs for this project. If you discover any issues, you can reach me via the contact details below._

## Support and contact details
_If you have any questions about this project, please contact Andrew at andrew.m.merrell@gmail.com_

## Technologies Used
_Java_
_PostgreSQL
_Spark Framework_
_Velocity Template Engine_

### License

Copyright (c) 2016 **_Andrew Merrell_**

*Licensed under the MIT license.*
