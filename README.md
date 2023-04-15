
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


## Tech Stack & Open-Source Libraries
- Architectures & Components
  - MVVM Architecture (Model - View - ViewModel)
  - Repository Pattern
  - ViewModel - Allows data to survive configuration changes such as screen rotations.
  - LiveData - An observable data holder class.
  - ViewBinding - A feature that allows you to more easily write code that interacts with views.
  - SwipeRefreshLayout - Implement the swipe-to-refresh UI pattern.
- The Room persistence - Provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - A type-safe HTTP client for Android and the JVM.
- [Dagger](https://github.com/google/dagger) - A fast dependency injector for Android and Java.
- [Glide](https://github.com/bumptech/glide), [GlidePalette](https://github.com/florent37/GlidePalette) - Loading images from network.
- [Material-Components](https://github.com/material-components/material-components-android) - Material design components for building CardView.
- [ProgressView](https://github.com/skydoves/progressview) - A polished and flexible ProgressView, fully customizable with animations.

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
