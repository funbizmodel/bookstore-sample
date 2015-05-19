/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package org.funbizmodel.bookstore.service;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Carlos Sierra Andrés
 */
public interface Service<B, Q, C extends Context<Q, ?>> {
	C create(Consumer<B> consumer);

	Stream<C> create(Consumer<B>... consumers);

	Stream<C> create(
		Stream<Consumer<B>> consumers);

	C withId(String id);

	Stream<C> all();
}
