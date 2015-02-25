package com.rgm.attribution;

/**
 * An annotation for when you want to attribute code that you've copied, but
 * are blatantly ignoring the license requirements and just DGAF.
 *
 * <b>Please note, this does not condone theft of intellectual property</b>.
 *
 * @author Rob Mills
 * @version 1.1
 * @since 1.0
 */
public @interface Stolen {

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
