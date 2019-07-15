/**
 * 
 */
package core;

import io.restassured.http.ContentType;

/**
 * @author anderson.mann
 *
 */
public interface Constants {

	String APP_BASE_URL = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
	Integer APP_PORT = 80;
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	Long MAX_TIMEOUT = 1000l;
}
