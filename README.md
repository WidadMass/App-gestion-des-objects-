# App-gestion-des-objects-

## Description
Ce projet est une application Spring Boot de gestion d'objets de location. Elle permet de créer, lire, mettre à jour et supprimer des informations sur des smartphones disponibles pour la location.

## Fonctionnalités
- **CRUD** : Créer, Lire, Mettre à jour, Supprimer des objets de type `Smartphone`.
- **Endpoints REST** : API pour gérer les smartphones avec les opérations CRUD.
- **Interface avec Thymeleaf** : Une interface de base est disponible pour interagir avec l'application depuis le navigateur.

## Technologies utilisées
- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf** pour la partie front-end
- **H2 Database** (base de données en mémoire pour le développement)
- **Git** pour le suivi de version

## Structure du projet
- `controllers` : Gère les requêtes HTTP et les réponses.
- `entities` : Définit les entités de base de données (modèle de données).
- `repositories` : Interface pour les opérations CRUD sur les entités.
- `services` : Contient la logique métier de l'application.

## Endpoints API
### Base URL
`http://localhost:3030`

### Exemples de requêtes
- **GET** `/smartphones` : Récupère la liste de tous les smartphones.
- **GET** `/smartphones/{id}` : Récupère un smartphone par ID.
- **POST** `/smartphones` : Ajoute un nouveau smartphone.
  ```json
  {
    "serialNumber": "SN12345",
    "brand": "Apple",
    "releaseDate": "2023-01-01",
    "status": "AVAILABLE"
  }
