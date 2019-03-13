# EasyAdapter
This project is an evolution of [EasyAdapter](https://github.com/MaksTuev/EasyAdapter).

This adapter is created to simplify the process of adding complex content to RecyclerView.
The main goal is to use particular ItemController for each individual item. Controller will define the element's behavior and display it on the View.

Can be used to display dynamic and static data lists.

## Usage
1. Create instance of [EasyAdapter](src/main/java/ru/surfstudio/android/easyadapter/EasyAdapter.java) with default constructor and pass it to `RecyclerView`
2. For each type of element in the list, create the typed [controller](src/main/java/ru/surfstudio/android/easyadapter/controller)
3. Create [ItemList](src/main/java/ru/surfstudio/android/easyadapter/ItemList.java) with pairs "Data + Controller"
4. Pass filled `ItemList` to `EasyAdapter` through the `setItems()` method.

[Example](../easyadapter_sample)

## Add to your module
Gradle:
```
    implementation "TODO BINTRAY"
```

## License
```
  Copyright (c) 2018-present, SurfStudio LLC, Maxim Tuev.

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
