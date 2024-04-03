package com.rendox.grocerygenius.data.product

import com.rendox.grocerygenius.data.Syncable
import com.rendox.grocerygenius.model.Product

interface ProductRepository : Syncable {
    suspend fun insertProduct(product: Product)
    suspend fun getProductsByCategory(categoryId: String): List<Product>
    suspend fun getProductsByName(name: String): List<Product>
    suspend fun updateProductCategory(productId: String, categoryId: String?)
    suspend fun updateProductIcon(productId: String, iconId: String)
    suspend fun deleteProductById(productId: String)
}