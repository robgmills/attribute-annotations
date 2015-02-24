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
 * @version 1.0
 * @since 1.0
 */
@Documented
@Inherited
public @interface Attribution {

	/**
	 * A url for where to find the cited code.
	 *
	 * @return
	 */
	String url() default "";

	/**
	 * The license that the cited code provides.
	 *
	 * @return the cited code's License
	 */
	License license() default License.NONE;

	/**
	 * The date that the code was cited.
	 *
	 * @return
	 */
	String dateCited() default "";
}
