package fr.niji.mobile.android.socle.test

import org.junit.Assert
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import java.io.StringWriter
import kotlin.reflect.KClass

abstract class BaseParsingUnitTest : BaseUnitTest() {

    fun <T> testBodySerialization(body: T, expectedBodyFileName: String) {
        //GIVEN
        val expectedBody = getFileAsString(expectedBodyFileName)

        // WHEN
        val writer = StringWriter()
        Persister(AnnotationStrategy()).write(body, writer)
        val generatedBody = writer.buffer.toString()

        // THEN
        println("XML body:\n$generatedBody")
        println("Expected:\n$expectedBody")
        Assert.assertEquals(
                expectedBody.replace("\r", "").replace(" ", "").replace("\t", ""),
                generatedBody.replace(" ", ""))
    }

    fun <T : Any> testResponseDeserialization(responseFileName: String, expectedResponse: T) {
        //GIVEN
        val file = getFile(responseFileName)

        // WHEN
        val response = Persister().read(expectedResponse::class.java, file, false)

        // THEN
        Assert.assertEquals(expectedResponse.toString(), response.toString())
    }

    fun <T : Any> testResponseDeserializationException(responseFileName: String, kClass: KClass<T>) {
        //GIVEN
        val file = getFile(responseFileName)

        // WHEN
        Persister().read(kClass.java, file, false)

        // THEN
        // throw exception, see "expected" in annotation @Test where this is called
    }
}
