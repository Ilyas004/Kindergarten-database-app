package com.example.kindergartendatabase.di

import android.app.Application
import androidx.room.Room
import com.example.kindergartendatabase.data.room.KindergartenDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideKindergartenDatabase(app: Application): KindergartenDatabase {
        return Room.databaseBuilder(
            app,
            KindergartenDatabase::class.java,
            "kindergarten_database"
        ).build()
    }
}