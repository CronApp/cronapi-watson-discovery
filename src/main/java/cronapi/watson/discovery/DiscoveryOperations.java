package cronapi.watson.discovery;

import com.ibm.watson.developer_cloud.discovery.v1.Discovery;
import com.ibm.watson.developer_cloud.discovery.v1.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData
public final class DiscoveryOperations {

  @CronapiMetaData
  public static Environment createEnvironment(String versionDate, String username, String password, String endPoint,
                                              Map<String, String> headers, CreateEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createEnvironment(options).execute();
  }

  @CronapiMetaData
  public static void deleteEnvironment(String versionDate, String username, String password, String endPoint,
                                       Map<String, String> headers, DeleteEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteEnvironment(options).execute();
  }

  @CronapiMetaData
  public static Environment getEnvironment(String versionDate, String username, String password, String endPoint,
                                           Map<String, String> headers, GetEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getEnvironment(options).execute();
  }

  @CronapiMetaData
  public static ListEnvironmentsResponse listEnvironments(String versionDate, String username, String password,
                                                          String endPoint, Map<String, String> headers,
                                                          ListEnvironmentsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listEnvironments(options).execute();
  }

  @CronapiMetaData
  public static ListCollectionFieldsResponse listFields(String versionDate, String username, String password,
                                                        String endPoint, Map<String, String> headers,
                                                        ListFieldsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listFields(options).execute();
  }

  @CronapiMetaData
  public static Environment updateEnvironment(String versionDate, String username, String password,
                                              String endPoint, Map<String, String> headers,
                                              UpdateEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateEnvironment(options).execute();
  }

  @CronapiMetaData
  public static Configuration createConfiguration(String versionDate, String username, String password,
                                                  String endPoint, Map<String, String> headers,
                                                  CreateConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createConfiguration(options).execute();
  }

  @CronapiMetaData
  public static Void deleteConfiguration(String versionDate, String username, String password,
                                         String endPoint, Map<String, String> headers, DeleteConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteConfiguration(options).execute();
  }

  @CronapiMetaData
  public static Configuration getConfiguration(String versionDate, String username, String password,
                                               String endPoint, Map<String, String> headers,
                                               GetConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getConfiguration(options).execute();
  }

  @CronapiMetaData
  public static ListConfigurationsResponse listConfigurations(String versionDate, String username, String password,
                                                              String endPoint, Map<String, String> headers,
                                                              ListConfigurationsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listConfigurations(options).execute();
  }

  @CronapiMetaData
  public static Configuration updateConfiguration(String versionDate, String username, String password,
                                                  String endPoint, Map<String, String> headers,
                                                  UpdateConfigurationOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateConfiguration(options).execute();
  }

  @CronapiMetaData
  public static TestDocument testConfigurationInEnvironment(String versionDate, String username, String password,
                                                            String endPoint, Map<String, String> headers,
                                                            TestConfigurationInEnvironmentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.testConfigurationInEnvironment(options).execute();
  }

  @CronapiMetaData
  public static Collection createCollection(String versionDate, String username, String password,
                                            String endPoint, Map<String, String> headers,
                                            CreateCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCollection(options).execute();
  }

  @CronapiMetaData
  public static Void deleteCollection(String versionDate, String username, String password,
                                      String endPoint, Map<String, String> headers, DeleteCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteCollection(options).execute();
  }

  @CronapiMetaData
  public static Collection getCollection(String versionDate, String username, String password,
                                         String endPoint, Map<String, String> headers, GetCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCollection(options).execute();
  }

  @CronapiMetaData
  public static ListCollectionFieldsResponse listCollectionFields(String versionDate, String username, String password,
                                                                  String endPoint, Map<String, String> headers,
                                                                  ListCollectionFieldsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listCollectionFields(options).execute();
  }

  @CronapiMetaData
  public static ListCollectionsResponse listCollections(String versionDate, String username, String password,
                                                        String endPoint, Map<String, String> headers,
                                                        ListCollectionsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listCollections(options).execute();
  }

  @CronapiMetaData
  public static Collection updateCollection(String versionDate, String username, String password,
                                            String endPoint, Map<String, String> headers,
                                            UpdateCollectionOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateCollection(options).execute();
  }

  @CronapiMetaData
  public static DocumentAccepted addDocument(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, AddDocumentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.addDocument(options).execute();
  }

  @CronapiMetaData
  public static Void deleteDocument(String versionDate, String username, String password, String endPoint,
                                    Map<String, String> headers, DeleteDocumentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteDocument(options).execute();
  }

  @CronapiMetaData
  public static DocumentStatus getDocumentStatus(String versionDate, String username, String password, String endPoint,
                                                 Map<String, String> headers, GetDocumentStatusOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getDocumentStatus(options).execute();
  }

  @CronapiMetaData
  public static DocumentAccepted updateDocument(String versionDate, String username, String password, String endPoint,
                                                Map<String, String> headers, UpdateDocumentOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateDocument(options).execute();
  }

  @CronapiMetaData
  public static QueryResponse federatedQuery(String versionDate, String username, String password, String endPoint,
                                             Map<String, String> headers, FederatedQueryOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);
    return service.federatedQuery(options).execute();
  }

  @CronapiMetaData
  public static QueryNoticesResponse federatedQueryNotices(String versionDate, String username, String password,
                                                           String endPoint, Map<String, String> headers,
                                                           FederatedQueryNoticesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.federatedQueryNotices(options).execute();
  }

  @CronapiMetaData
  public static QueryResponse query(String versionDate, String username, String password,
                                    String endPoint, Map<String, String> headers, QueryOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.query(options).execute();
  }

  @CronapiMetaData
  public static QueryEntitiesResponse queryEntities(String versionDate, String username, String password,
                                                    String endPoint, Map<String, String> headers,
                                                    QueryEntitiesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.queryEntities(options).execute();
  }

  @CronapiMetaData
  public static QueryNoticesResponse queryNotices(String versionDate, String username, String password,
                                                  String endPoint, Map<String, String> headers,
                                                  QueryNoticesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.queryNotices(options).execute();
  }

  @CronapiMetaData
  public static QueryRelationsResponse queryRelations(String versionDate, String username, String password,
                                                      String endPoint, Map<String, String> headers,
                                                      QueryRelationsOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.queryRelations(options).execute();
  }

  @CronapiMetaData
  public static TrainingQuery addTrainingData(String versionDate, String username, String password,
                                              String endPoint, Map<String, String> headers,
                                              AddTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.addTrainingData(options).execute();
  }

  @CronapiMetaData
  public static TrainingExample createTrainingExample(String versionDate, String username, String password,
                                                      String endPoint, Map<String, String> headers,
                                                      CreateTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createTrainingExample(options).execute();
  }

  @CronapiMetaData
  public static Void deleteAllTrainingData(String versionDate, String username, String password,
                                           String endPoint, Map<String, String> headers,
                                           DeleteAllTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteAllTrainingData(options).execute();
  }

  @CronapiMetaData
  public static Void deleteTrainingData(String versionDate, String username, String password,
                                        String endPoint, Map<String, String> headers,
                                        DeleteTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteTrainingData(options).execute();
  }

  @CronapiMetaData
  public static Void deleteTrainingExample(String versionDate, String username, String password,
                                           String endPoint, Map<String, String> headers,
                                           DeleteTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.deleteTrainingExample(options).execute();
  }

  @CronapiMetaData
  public static TrainingQuery getTrainingData(String versionDate, String username, String password,
                                              String endPoint, Map<String, String> headers,
                                              GetTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getTrainingData(options).execute();
  }

  @CronapiMetaData
  public static TrainingExample getTrainingExample(String versionDate, String username, String password,
                                                   String endPoint, Map<String, String> headers,
                                                   GetTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getTrainingExample(options).execute();
  }

  @CronapiMetaData
  public static TrainingDataSet listTrainingData(String versionDate, String username, String password,
                                                 String endPoint, Map<String, String> headers,
                                                 ListTrainingDataOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listTrainingData(options).execute();
  }

  @CronapiMetaData
  public static TrainingExampleList listTrainingExamples(String versionDate, String username, String password,
                                                         String endPoint, Map<String, String> headers,
                                                         ListTrainingExamplesOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listTrainingExamples(options).execute();
  }

  @CronapiMetaData
  public static TrainingExample updateTrainingExample(String versionDate, String username, String password,
                                                      String endPoint, Map<String, String> headers,
                                                      UpdateTrainingExampleOptions options) {
    Discovery service = new Discovery(versionDate);
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.updateTrainingExample(options).execute();
  }
}
