package dk.itu.configurator;

import android.app.Application;
import android.test.ApplicationTestCase;

import modelMDD2.Feature;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    private void testRoot() throws Exception
    {
        ConfiguratorActivityFragment ca = new ConfiguratorActivityFragment(getData());
        assertNotNull(ca.configuration.getRoot());
    }

    private void testRootName() throws Exception
    {
        ConfiguratorActivityFragment ca = new ConfiguratorActivityFragment(getData());
        String rootName = ((Feature)ca.configuration.getRoot()).getName();
        assertEquals(rootName, "Car");
    }

    private String getData(){
        return "{\n" +
                "  \"eClass\" : \"http://www.example.org/modelMDD2#//Model\",\n" +
                "  \"root\" : {\n" +
                "    \"eClass\" : \"http://www.example.org/modelMDD2#//Feature\",\n" +
                "    \"name\" : \"Car\",\n" +
                "    \"subfeature\" : [ {\n" +
                "      \"eClass\" : \"http://www.example.org/modelMDD2#//Mandatory\",\n" +
                "      \"name\" : \"Engine\",\n" +
                "      \"groups\" : [ {\n" +
                "        \"eClass\" : \"http://www.example.org/modelMDD2#//Xor\",\n" +
                "        \"name\" : \"Power\",\n" +
                "        \"grouped\" : [ {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"HP120\",\n" +
                "          \"attribute\" : {\n" +
                "            \"eClass\" : \"http://www.example.org/modelMDD2#//Number\",\n" +
                "            \"value\" : 120\n" +
                "          }\n" +
                "        }, {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"HP150\",\n" +
                "          \"attribute\" : {\n" +
                "            \"eClass\" : \"http://www.example.org/modelMDD2#//Number\",\n" +
                "            \"value\" : 150\n" +
                "          }\n" +
                "        } ]\n" +
                "      }, {\n" +
                "        \"eClass\" : \"http://www.example.org/modelMDD2#//Or\",\n" +
                "        \"name\" : \"Fuel\",\n" +
                "        \"grouped\" : [ {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Gas\"\n" +
                "        }, {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Electric\"\n" +
                "        } ]\n" +
                "      } ]\n" +
                "    }, {\n" +
                "      \"eClass\" : \"http://www.example.org/modelMDD2#//Optional\",\n" +
                "      \"name\" : \"Rims\",\n" +
                "      \"groups\" : [ {\n" +
                "        \"eClass\" : \"http://www.example.org/modelMDD2#//Xor\",\n" +
                "        \"name\" : \"Color\",\n" +
                "        \"grouped\" : [ {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Red\"\n" +
                "        }, {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Black\",\n" +
                "          \"constrains\" : [ {\n" +
                "            \"eClass\" : \"http://www.example.org/modelMDD2#//Binary\",\n" +
                "            \"Operator\" : \"&&\",\n" +
                "            \"rightExp\" : {\n" +
                "              \"eClass\" : \"http://www.example.org/modelMDD2#//Constrain\",\n" +
                "              \"featureReference\" : {\n" +
                "                \"$ref\" : \"//@root/@subfeature.1/@groups.1/@grouped.0\"\n" +
                "              }\n" +
                "            },\n" +
                "            \"leftExp\" : {\n" +
                "              \"eClass\" : \"http://www.example.org/modelMDD2#//Constrain\",\n" +
                "              \"featureReference\" : {\n" +
                "                \"$ref\" : \"//@root/@subfeature.0/@groups.0/@grouped.1\"\n" +
                "              }\n" +
                "            }\n" +
                "          } ]\n" +
                "        } ]\n" +
                "      }, {\n" +
                "        \"eClass\" : \"http://www.example.org/modelMDD2#//Xor\",\n" +
                "        \"name\" : \"Material\",\n" +
                "        \"grouped\" : [ {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Aluminum\"\n" +
                "        }, {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"CarbonFiber\"\n" +
                "        } ]\n" +
                "      } ]\n" +
                "    }, {\n" +
                "      \"eClass\" : \"http://www.example.org/modelMDD2#//Mandatory\",\n" +
                "      \"name\" : \"Transmission\",\n" +
                "      \"groups\" : [ {\n" +
                "        \"eClass\" : \"http://www.example.org/modelMDD2#//Or\",\n" +
                "        \"name\" : \"Type\",\n" +
                "        \"grouped\" : [ {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Manual\"\n" +
                "        }, {\n" +
                "          \"eClass\" : \"http://www.example.org/modelMDD2#//Grouped\",\n" +
                "          \"name\" : \"Automatic\"\n" +
                "        } ]\n" +
                "      } ]\n" +
                "    } ]\n" +
                "  }\n" +
                "}";
    }
}