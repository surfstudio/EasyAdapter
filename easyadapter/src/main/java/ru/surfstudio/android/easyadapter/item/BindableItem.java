/*
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
 */
package ru.surfstudio.android.easyadapter.item;


import ru.surfstudio.android.easyadapter.ItemList;
import ru.surfstudio.android.easyadapter.controller.BindableItemController;
import ru.surfstudio.android.easyadapter.holder.BindableViewHolder;

/**
 * Item for {@link ItemList} with data.
 *
 * @param <T> data type
 * @param <H> ViewHolder type
 */
public final class BindableItem<T, H extends BindableViewHolder<T>> extends BaseItem<H> {
    private T data;

    public BindableItem(T data, BindableItemController<T, H> itemController) {
        super(itemController);
        this.data = data;
    }

    /**
     * Get the data from item.
     *
     * @return data
     */
    public T getData() {
        return data;
    }
}
