package com.rgm.attribution;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

/**
 * An annotation for when you want to cite a blog, documentation, tutorial, or
 * whatever else you use to help you write code.
 *
 * Useful for when you want to track where you got an idea from.
 *
 * @author Rob Mills
 * @version 1.1
 * @since 1.0
 */
@Documented
@Inherited
public @interface Attribution {

	/**
	 * A url for where to find the cited code.
	 */
	String url() default "";

	/**
	 * The license that the cited code provides.
	 */
	License license() default License.NONE;

	/**
	 * The date that the code was cited.
	 */
	String dateCited() default "";

	/**
	 * The name of the developer who originally wrote the code and person to
	 * blame if it doesn't work.
	 *
	 * @since 1.1
	 */
	String blame() default "";
}
