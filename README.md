
<h1 align="center">Pokemon - PokeAPI</h1>


<p align="center">  
  The project development with ViewBinding, ViewModel with LiveData, Dagger2, Retrofit2 with RxJava3, MaterialCardView with ShapeableOverlay Style and ProgressView based on MVVM Architecture.
</p>
</br>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=24"><img alt="API" src="https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat"/></a>
  <a href="https://github.com/skydoves/Pokedex-AR/actions"><img alt="Build Status" src="https://github.com/skydoves/Pokedex-AR/workflows/Android%20CI/badge.svg"/></a> 
</p>


## Fonctionnalités
  - Affichage de la liste de tous les Pokémons avec leurs images et noms
  - Affichage des détails de chaque Pokémon, y compris son nom, numéro, taille, poids, type, etc.
  - Visualisation de l'image de chaque Pokémon
  - Stockage des Pokémons favoris de l'utilisateur dans une base de données locale SQLite
  - Utilisation d'une couleur de fond aléatoire pour chaque Pokémon pour améliorer l'expérience utilisateur
  - SwipeRefreshLayout - Implement the swipe-to-refresh UI pattern.

## Technologies utilisées
  - Architecture MVVM pour séparer les préoccupations et rendre l'application facile à maintenir
  - Retrofit pour la gestion des appels d'API et la récupération de données depuis l'API Pokeapi
  - Gson pour la conversion des données JSON récupérées en objets Java
  - Glide pour le chargement et l'affichage des images de Pokemon
  - RecyclerView pour l'affichage de la liste de Pokemon avec leurs images et leurs noms
  - SQLite pour stocker les Pokemons favoris de l'utilisateur dans une base de données locale
  - Java pour le langage de programmation
  - Android Studio pour l'environnement de développement
  - Git pour le système de gestion de versions
  
 ## API Pokeapi
 
 L'application utilise l'API Pokeapi pour récupérer les informations sur les Pokémons. Pokeapi a été choisi pour sa grande fiabilité, sa facilité d'utilisation et la richesse de ses données sur les Pokémons. L'API fournit une source de données complète et à jour sur les différents Pokémons, y compris leurs noms, images, poids et hauteurs. Elle est facilement accessible via des appels HTTP RESTful et fournit des données au format JSON, qui peuvent être facilement converties en objets Java utilisables dans l'application.
 
 ## Bibliothèques externes
 
 L'application utilise également plusieurs bibliothèques externes telles que Retrofit pour effectuer les appels API, Glide pour afficher les images, et RecyclerView pour afficher la liste des Pokémons. Ces bibliothèques ont été choisies pour leur fiabilité, leur facilité d'utilisation et leur capacité à améliorer l'expérience utilisateur.
 
## Architecture
Pokedex-AR is based on MVVM architecture and a repository pattern.

![architecture](https://user-images.githubusercontent.com/24237865/77502018-f7d36000-6e9c-11ea-92b0-1097240c8689.png)

## Open API
<img src="https://user-images.githubusercontent.com/85010162/150532477-e758e4db-6261-47da-81da-815139a0be8d.png" align="right" width="20%"/>

The project using the [PokeAPI](https://pokeapi.co/) for constructing RESTful API.<br>
PokeAPI provides a RESTful API interface to highly detailed objects built from thousands of lines of data related to Pokémon.


# License
```xml
Designed and developed by 2023 yamenbh (AYMANE AIT EL BHIRI)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
