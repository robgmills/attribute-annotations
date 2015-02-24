package com.rgm.attribution;

/**
 * An annotation for when you want to attribute code that you've copied, but
 * are blatantly ignoring the license requirements and just DGAF.
 *
 * <b>Please note, this does not condone theft of intellectual property</b>.
 *
 * @author Rob Mills
 * @version 1.0
 * @since 1.0
 */
public @interface Stolen {

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
