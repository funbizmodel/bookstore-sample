/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.funbizmodel.bookstore.model.author;

import org.funbizmodel.bookstore.model.book.BookContext;

import java.util.stream.Stream;

/**
* @author Carlos Sierra Andrés
*/
public class AuthorUpdater {
	protected String newName;
	protected Stream<BookContext> addedBooks;

	public void addBooks(Stream<BookContext> addedBooks) {
		this.addedBooks = addedBooks;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}
}
