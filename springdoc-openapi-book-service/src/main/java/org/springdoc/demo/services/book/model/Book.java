/*
 *
 *  * Copyright 2019-2020 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.springdoc.demo.services.book.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Book {

	private long id;

	@NotBlank
	@Size(min = 0, max = 20)
	private String title;

	@NotBlank
	@Size(min = 0, max = 30)
	private String author;

	// showing drift
	private String author2;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	
	//showing drift
	public String getAuthor2() {
		return author2;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
