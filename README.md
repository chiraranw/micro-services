# Micro-services
This repository is dedicated to keep all my projects & exercises for learning micor-services.

# CQRS
Helps us to **S**eggregate **R**esponsibilities in our application by having **C**ommands (DB write operartions) and **Q**ueries (DB read operartions) run on seperate services.
**NB:** *The query service and command service can use the same Data Model or diffrent Data Models*.

CQRS allows us to scale our application since the processing of **C**ommands & **Q**ueries is *Asymmetrical*, e.g. 2 command services and 25 query services.  
