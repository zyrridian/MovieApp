package com.example.movieapp.models.movies

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class MovieImageResponse(

    @field:SerializedName("backdrops")
	val backdrops: List<BackdropsItem>? = null,

//	@field:SerializedName("posters")
//	val posters: List<PostersItem?>? = null,

    @field:SerializedName("id")
	val id: Int? = null,

//	@field:SerializedName("logos")
//	val logos: List<LogosItem?>? = null
)

@Entity(tableName = "backdrops")
data class BackdropsItem(

//	@field:SerializedName("aspect_ratio")
//	val aspectRatio: Any? = null,

	@field:SerializedName("file_path")
	@PrimaryKey val filePath: String,

//	@field:SerializedName("vote_average")
//	val voteAverage: Any? = null,

	@field:SerializedName("width")
	val width: Int? = null,

//	@field:SerializedName("iso_639_1")
//	val iso6391: Any? = null,

	@field:SerializedName("vote_count")
	val voteCount: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

//data class PostersItem(
//
//	@field:SerializedName("aspect_ratio")
//	val aspectRatio: Any? = null,
//
//	@field:SerializedName("file_path")
//	val filePath: String? = null,
//
//	@field:SerializedName("vote_average")
//	val voteAverage: Any? = null,
//
//	@field:SerializedName("width")
//	val width: Int? = null,
//
//	@field:SerializedName("iso_639_1")
//	val iso6391: String? = null,
//
//	@field:SerializedName("vote_count")
//	val voteCount: Int? = null,
//
//	@field:SerializedName("height")
//	val height: Int? = null
//)
//
//data class LogosItem(
//
//	@field:SerializedName("aspect_ratio")
//	val aspectRatio: Any? = null,
//
//	@field:SerializedName("file_path")
//	val filePath: String? = null,
//
//	@field:SerializedName("vote_average")
//	val voteAverage: Any? = null,
//
//	@field:SerializedName("width")
//	val width: Int? = null,
//
//	@field:SerializedName("iso_639_1")
//	val iso6391: String? = null,
//
//	@field:SerializedName("vote_count")
//	val voteCount: Int? = null,
//
//	@field:SerializedName("height")
//	val height: Int? = null
//)