package solrconnect

import org.slf4j.{Logger, LoggerFactory}

object `package` {

  trait Logging {
    val log: Logger = LoggerFactory.getLogger(this.getClass)
  }

  object Constants {

    object Props {
      val TOPIC_PREFIX = "topicPrefix"
      val ZK_HOST = "zkHost"
      val ZK_CHROOT = "zkChroot"
      val COLLECTION_NAME = "collectionName"
      val BATCH_SIZE = "batchSize"
      val QUERY = "query"
    }

    object Documentation {
      val PREFIX_TO_ADD_TO_COLLECTION_NAME_TO_GET_TOPIC_NAME = "Prefix to add to collection name to get topic name"
      val ZOOKEEPER_HOST_COMMA_SEPARATED = "Zookeeper host comma separated"
      val CHROOT_IF_AVAILABLE = "Chroot if available"
      val NAME_OF_COLLECTION_TO_INDEX = "Name of collection to index"
      val NUMBER_OF_DOCS_TO_READ_IN_EACH_BATCH = "Number of docs to read in each batch"
      val SOLR_QUERY_FILTER_WHILE_FETCHING_DOCS = "Solr query filter while fetching docs"
    }

    object SolrFieldAttribute {
      val NAME = "name"
      val TYPE = "type"
      val MULTIVALUED = "multiValued"
      val INDEXED = "indexed"
      val STORED = "stored"
      val REQUIRED = "required"
    }

    object SolrDataType {
      val STRING = "STRING"
      val PINT = "PINT"
      val PLONG = "PLONG"
    }

  }

}
