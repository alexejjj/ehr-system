import axios from 'axios'
import {buildComposition} from "../openehr/data";

const Composition = {
  "_type" : "COMPOSITION",
  "name" : {
    "_type" : "DV_TEXT",
    "value" : "Onco-dermatology encounter.v0"
  },
  "archetype_details" : {
    "archetype_id" : {
      "value" : "openEHR-EHR-COMPOSITION.encounter.v1"
    },
    "template_id" : {
      "value" : "Onco-dermatology encounter en.v0"
    },
    "rm_version" : "1.0.4"
  },
  "composer": {
      "_type": "PARTY_IDENTIFIED",
      "name": "Dr. House"
  },
  "language" : {
    "_type" : "CODE_PHRASE",
    "terminology_id" : {
      "_type" : "TERMINOLOGY_ID",
      "value" : "ISO_639-1"
    },
    "code_string" : "en"
  },
  "territory" : {
    "_type" : "CODE_PHRASE",
    "terminology_id" : {
      "_type" : "TERMINOLOGY_ID",
      "value" : "ISO_3166-1"
    },
    "code_string" : "RU"
  },
  "category" : {
    "_type" : "DV_CODED_TEXT",
    "value" : "event",
    "defining_code" : {
      "_type" : "CODE_PHRASE",
      "terminology_id" : {
        "_type" : "TERMINOLOGY_ID",
        "value" : "openehr"
      },
      "code_string" : "433"
    }
  },
  "context" : {
    "_type" : "EVENT_CONTEXT",
    "start_time" : {
      "_type" : "DV_DATE_TIME",
      "value" : "2022-05-23T11:16:02.170"
    },
    "end_time" : {
      "_type" : "DV_DATE_TIME",
      "value" : "2022-05-23T11:16:02.170"
    },
    "setting" : {
      "_type" : "DV_CODED_TEXT",
      "value" : "emergency care",
      "defining_code" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "openehr"
        },
        "code_string" : "227"
      }
    }
  },
  "content" : [ {
    "_type" : "SECTION",
    "name" : {
      "_type" : "DV_TEXT",
      "value" : "Health and lifestyle"
    },
    "archetype_details" : {
      "archetype_id" : {
        "value" : "openEHR-EHR-SECTION.adhoc.v1"
      },
      "template_id" : {
        "value" : "Onco-dermatology encounter en.v0"
      },
      "rm_version" : "1.0.4"
    },
    "items" : [ {
      "_type" : "OBSERVATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Weight"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-OBSERVATION.body_weight.v2"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "history"
        },
        "origin" : {
          "_type" : "DV_DATE_TIME",
          "value" : "2022-05-23T11:16:02.170"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-05-23T11:16:02.170"
          },
          "data" : {
            "_type" : "ITEM_TREE",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Simple"
            },
            "items" : [ {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Weight"
              },
              "value" : {
                "_type" : "DV_QUANTITY",
                "units" : "kg",
                "magnitude" : 70.2
              },
              "archetype_node_id" : "at0004"
            } ],
            "archetype_node_id" : "at0001"
          },
          "archetype_node_id" : "at0003"
        } ],
        "archetype_node_id" : "at0002"
      },
      "archetype_node_id" : "openEHR-EHR-OBSERVATION.body_weight.v2"
    }, {
      "_type" : "OBSERVATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Height"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-OBSERVATION.height.v2"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "history"
        },
        "origin" : {
          "_type" : "DV_DATE_TIME",
          "value" : "2022-05-23T11:16:02.170"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-05-23T11:16:02.170"
          },
          "data" : {
            "_type" : "ITEM_TREE",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Simple"
            },
            "items" : [ {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Height"
              },
              "value" : {
                "_type" : "DV_QUANTITY",
                "units" : "cm",
                "magnitude" : 177.4
              },
              "archetype_node_id" : "at0004"
            } ],
            "archetype_node_id" : "at0003"
          },
          "archetype_node_id" : "at0002"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-OBSERVATION.height.v2"
    }, {
      "_type" : "EVALUATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Physical characteristics"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-EVALUATION.physical_characteristics.v0"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "_type" : "ITEM_TREE",
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "Item tree"
        },
        "items" : [ {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Hair color"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "black"
          },
          "archetype_node_id" : "at0003"
        }, {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Eye color"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "blue"
          },
          "archetype_node_id" : "at0004"
        }, {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Skin tone"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "white"
          },
          "archetype_node_id" : "at0005"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-EVALUATION.physical_characteristics.v0"
    }, {
      "_type" : "OBSERVATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Skin disease risk"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "History"
        },
        "origin" : {
          "_type" : "DV_DATE_TIME",
          "value" : "2022-05-23T11:16:02.170"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-05-23T11:16:02.170"
          },
          "data" : {
            "_type" : "ITEM_TREE",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Tree"
            },
            "items" : [ {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Freckles"
              },
              "value" : {
                "_type" : "DV_CODED_TEXT",
                "value" : "many",
                "defining_code" : {
                  "_type" : "CODE_PHRASE",
                  "terminology_id" : {
                    "_type" : "TERMINOLOGY_ID",
                    "value" : "local"
                  },
                  "code_string" : "at0005"
                }
              },
              "archetype_node_id" : "at0004"
            }, {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Does the skin turn red when sunburned?"
              },
              "value" : {
                "_type" : "DV_BOOLEAN",
                "value" : false
              },
              "archetype_node_id" : "at0009"
            }, {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Does the skin tan in the sun?"
              },
              "value" : {
                "_type" : "DV_CODED_TEXT",
                "value" : "fast and strong",
                "defining_code" : {
                  "_type" : "CODE_PHRASE",
                  "terminology_id" : {
                    "_type" : "TERMINOLOGY_ID",
                    "value" : "local"
                  },
                  "code_string" : "at0012"
                }
              },
              "archetype_node_id" : "at0011"
            }, {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "How often do you have vacation in the south?"
              },
              "value" : {
                "_type" : "DV_CODED_TEXT",
                "value" : "10 days per year",
                "defining_code" : {
                  "_type" : "CODE_PHRASE",
                  "terminology_id" : {
                    "_type" : "TERMINOLOGY_ID",
                    "value" : "local"
                  },
                  "code_string" : "at0022"
                }
              },
              "archetype_node_id" : "at0021"
            }, {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Do you use sunscreen in summer?"
              },
              "value" : {
                "_type" : "DV_BOOLEAN",
                "value" : true
              },
              "archetype_node_id" : "at0027"
            }, {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Sport"
              },
              "value" : {
                "_type" : "DV_CODED_TEXT",
                "value" : "other outdoor sports",
                "defining_code" : {
                  "_type" : "CODE_PHRASE",
                  "terminology_id" : {
                    "_type" : "TERMINOLOGY_ID",
                    "value" : "local"
                  },
                  "code_string" : "at0035"
                }
              },
              "archetype_node_id" : "at0026"
            } ],
            "archetype_node_id" : "at0003"
          },
          "archetype_node_id" : "at0002"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0"
    } ],
    "archetype_node_id" : "openEHR-EHR-SECTION.adhoc.v1"
  }, {
    "_type" : "SECTION",
    "name" : {
      "_type" : "DV_TEXT",
      "value" : "Anamnesis"
    },
    "archetype_details" : {
      "archetype_id" : {
        "value" : "openEHR-EHR-SECTION.adhoc.v1"
      },
      "template_id" : {
        "value" : "Onco-dermatology encounter en.v0"
      },
      "rm_version" : "1.0.4"
    },
    "items" : [ {
      "_type" : "OBSERVATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Story/History"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-OBSERVATION.story.v1"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "Event Series"
        },
        "origin" : {
          "_type" : "DV_DATE_TIME",
          "value" : "2022-05-23T11:16:02.170"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-05-23T11:16:02.170"
          },
          "data" : {
            "_type" : "ITEM_TREE",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Tree"
            },
            "items" : [ {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "Do you have a history of psoriasis?"
              },
              "value" : {
                "_type" : "DV_TEXT",
                "value" : "Yes"
              },
              "archetype_node_id" : "at0004"
            }, {
              "_type" : "ELEMENT",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "When did the lesion appear?"
              },
              "value" : {
                "_type" : "DV_TEXT",
                "value" : "Recently"
              },
              "archetype_node_id" : "at0004"
            } ],
            "archetype_node_id" : "at0003"
          },
          "archetype_node_id" : "at0002"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-OBSERVATION.story.v1"
    }, {
      "_type" : "EVALUATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Family history"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-EVALUATION.family_history.v2"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "_type" : "ITEM_TREE",
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "Tree"
        },
        "items" : [ {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Summary"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "Some summary"
          },
          "archetype_node_id" : "at0002"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-EVALUATION.family_history.v2"
    } ],
    "archetype_node_id" : "openEHR-EHR-SECTION.adhoc.v1"
  }, {
    "_type" : "SECTION",
    "name" : {
      "_type" : "DV_TEXT",
      "value" : "Nevus"
    },
    "archetype_details" : {
      "archetype_id" : {
        "value" : "openEHR-EHR-SECTION.adhoc.v1"
      },
      "template_id" : {
        "value" : "Onco-dermatology encounter en.v0"
      },
      "rm_version" : "1.0.4"
    },
    "items" : [ {
      "_type" : "OBSERVATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Physical examination findings"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-OBSERVATION.exam.v1"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "Event Series"
        },
        "origin" : {
          "_type" : "DV_DATE_TIME",
          "value" : "2022-05-23T11:16:02.170"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-05-23T11:16:02.170"
          },
          "data" : {
            "_type" : "ITEM_TREE",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Tree"
            },
            "items" : [ {
              "_type" : "CLUSTER",
              "name" : {
                "_type" : "DV_TEXT",
                "value" : "nevus_exam_en"
              },
              "archetype_details" : {
                "archetype_id" : {
                  "value" : "openEHR-EHR-CLUSTER.nevus_exam_en.v0"
                },
                "template_id" : {
                  "value" : "Onco-dermatology encounter en.v0"
                },
                "rm_version" : "1.0.4"
              },
              "items" : [ {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Height (X)"
                },
                "value" : {
                  "_type" : "DV_QUANTITY",
                  "units" : "mm",
                  "magnitude" : 2.12
                },
                "archetype_node_id" : "at0001"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Width (Y)"
                },
                "value" : {
                  "_type" : "DV_QUANTITY",
                  "units" : "mm",
                  "magnitude" : 3.25
                },
                "archetype_node_id" : "at0002"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Area"
                },
                "value" : {
                  "_type" : "DV_QUANTITY",
                  "units" : "mm2",
                  "magnitude" : 10.4
                },
                "archetype_node_id" : "at0003"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Borders"
                },
                "value" : {
                  "_type" : "DV_CODED_TEXT",
                  "value" : "clear",
                  "defining_code" : {
                    "_type" : "CODE_PHRASE",
                    "terminology_id" : {
                      "_type" : "TERMINOLOGY_ID",
                      "value" : "local"
                    },
                    "code_string" : "at0012"
                  }
                },
                "archetype_node_id" : "at0004"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Dominant color"
                },
                "value" : {
                  "_type" : "DV_CODED_TEXT",
                  "value" : "grey",
                  "defining_code" : {
                    "_type" : "CODE_PHRASE",
                    "terminology_id" : {
                      "_type" : "TERMINOLOGY_ID",
                      "value" : "local"
                    },
                    "code_string" : "at0018"
                  }
                },
                "archetype_node_id" : "at0005"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Shape"
                },
                "value" : {
                  "_type" : "DV_CODED_TEXT",
                  "value" : "round",
                  "defining_code" : {
                    "_type" : "CODE_PHRASE",
                    "terminology_id" : {
                      "_type" : "TERMINOLOGY_ID",
                      "value" : "local"
                    },
                    "code_string" : "at0021"
                  }
                },
                "archetype_node_id" : "at0006"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Inclusions"
                },
                "value" : {
                  "_type" : "DV_BOOLEAN",
                  "value" : true
                },
                "archetype_node_id" : "at0009"
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Symmetry"
                },
                "value" : {
                  "_type" : "DV_BOOLEAN",
                  "value" : true
                },
                "archetype_node_id" : "at0010"
              } ],
              "archetype_node_id" : "openEHR-EHR-CLUSTER.nevus_exam_en.v0"
            } ],
            "archetype_node_id" : "at0003"
          },
          "archetype_node_id" : "at0002"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-OBSERVATION.exam.v1"
    } ],
    "archetype_node_id" : "openEHR-EHR-SECTION.adhoc.v1"
  }, {
    "_type" : "SECTION",
    "name" : {
      "_type" : "DV_TEXT",
      "value" : "Additional"
    },
    "archetype_details" : {
      "archetype_id" : {
        "value" : "openEHR-EHR-SECTION.adhoc.v1"
      },
      "template_id" : {
        "value" : "Onco-dermatology encounter en.v0"
      },
      "rm_version" : "1.0.4"
    },
    "items" : [ {
      "_type" : "EVALUATION",
      "name" : {
        "_type" : "DV_TEXT",
        "value" : "Problem/Diagnosis"
      },
      "archetype_details" : {
        "archetype_id" : {
          "value" : "openEHR-EHR-EVALUATION.problem_diagnosis.v1"
        },
        "template_id" : {
          "value" : "Onco-dermatology encounter en.v0"
        },
        "rm_version" : "1.0.4"
      },
      "language" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "ISO_639-1"
        },
        "code_string" : "en"
      },
      "encoding" : {
        "_type" : "CODE_PHRASE",
        "terminology_id" : {
          "_type" : "TERMINOLOGY_ID",
          "value" : "IANA_character-sets"
        },
        "code_string" : "UTF-8"
      },
      "subject" : {
        "_type" : "PARTY_IDENTIFIED"
      },
      "data" : {
        "_type" : "ITEM_TREE",
        "name" : {
          "_type" : "DV_TEXT",
          "value" : "structure"
        },
        "items" : [ {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Problem/Diagnosis name"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "Some Diagnoses"
          },
          "archetype_node_id" : "at0002"
        }, {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Clinical description"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "Some clinical description"
          },
          "archetype_node_id" : "at0009"
        }, {
          "_type" : "ELEMENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Comment"
          },
          "value" : {
            "_type" : "DV_TEXT",
            "value" : "Some comment"
          },
          "archetype_node_id" : "at0069"
        } ],
        "archetype_node_id" : "at0001"
      },
      "archetype_node_id" : "openEHR-EHR-EVALUATION.problem_diagnosis.v1"
    } ],
    "archetype_node_id" : "openEHR-EHR-SECTION.adhoc.v1"
  } ],
  "archetype_node_id" : "openEHR-EHR-COMPOSITION.encounter.v1"
}


class AqlQueries {
  static getAllPatientCompositionsQuery(ehrId) {
    return {
      "q": "SELECT c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.height.v2]/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value/magnitude as height, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.body_weight.v2]/data[at0002]/events[at0003]/data[at0001]/items[at0004]/value/magnitude as weight, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.physical_characteristics.v0]/data[at0001]/items[at0003]/value/value as hairColor, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.physical_characteristics.v0]/data[at0001]/items[at0004]/value/value as eyeColor, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.physical_characteristics.v0]/data[at0001]/items[at0005]/value/value as skinTone, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value/value as freckles, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]/data[at0001]/events[at0002]/data[at0003]/items[at0009]/value/value as doesTheSkinTurnRedWhenSunburned, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]/data[at0001]/events[at0002]/data[at0003]/items[at0011]/value/value as doesTheSkinTurnTanInTheSun, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]/data[at0001]/events[at0002]/data[at0003]/items[at0021]/value/value as howOftenDoYouHaveVacationInTheSouth, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]/data[at0001]/events[at0002]/data[at0003]/items[at0026]/value/value as sport, c/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]/data[at0001]/events[at0002]/data[at0003]/items[at0027]/value/value as doYouUseSunscreenInSummer, c/content[openEHR-EHR-SECTION.adhoc.v1,'Anamnesis']/items[openEHR-EHR-OBSERVATION.story.v1]/data[at0001]/events[at0002]/data[at0003]/items[at0004]/value/value as doYouHaveAHistoryOfPsoriasisValue, c/content[openEHR-EHR-SECTION.adhoc.v1,'Anamnesis']/items[openEHR-EHR-OBSERVATION.story.v1]/data[at0001]/events[at0002]/data[at0003]/items[at0004,'When did the lesion appear?']/value/value as whenDidTheLesionAppearValue, c/content[openEHR-EHR-SECTION.adhoc.v1,'Anamnesis']/items[openEHR-EHR-EVALUATION.family_history.v2]/data[at0001]/items[at0002]/value/value as summaryValue, c/content[openEHR-EHR-SECTION.adhoc.v1,'Anamnesis']/items[openEHR-EHR-EVALUATION.family_history.v2]/data[at0001]/items[at0028]/items[at0029]/value/value as familyDiagnosisNameValue, c/content[openEHR-EHR-SECTION.adhoc.v1,'Anamnesis']/items[openEHR-EHR-EVALUATION.family_history.v2]/data[at0001]/items[at0028]/items[at0030]/value/value as familyDescriptionValue, c/content[openEHR-EHR-SECTION.adhoc.v1,'Anamnesis']/items[openEHR-EHR-EVALUATION.family_history.v2]/data[at0001]/items[at0028]/items[at0071]/value/value as familyCasesValue, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0001]/value/magnitude as heightX, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0002]/value/magnitude as widthY, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0003]/value/magnitude as area, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0004]/value/value as borders, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0005]/value/value as dominantColor, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0006]/value/value as shape, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0009]/value/value as inclusions, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0010]/value/value as symmetry, c/content[openEHR-EHR-SECTION.adhoc.v1,'Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]/data[at0001]/events[at0002]/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]/items[at0011]/value/data as photo, c/content[openEHR-EHR-SECTION.adhoc.v1,'Additional']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]/data[at0001]/items[at0002]/value/value as diagnosisName, c/content[openEHR-EHR-SECTION.adhoc.v1,'Additional']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]/data[at0001]/items[at0009]/value/value as clinicalDescription, c/content[openEHR-EHR-SECTION.adhoc.v1,'Additional']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]/data[at0001]/items[at0069]/value/value as comment FROM EHR e CONTAINS COMPOSITION c WHERE e/ehr_id/value='fed6bc78-581d-467c-a521-7aef4ca595a9'"
    }
  }
}


export default class PatientService {
    static rootUrl = 'http://localhost:8080'
    static apiKey = `Basic ${process.env.AUTH_EHRBASE}`
    static aqlUrl = 'http://localhost:8080/ehrbase/rest/openehr/v1/query/aql'

    static async getCompositionByUUID(ehrId, compositionUUID) {
        try {
            const response = await axios({
                url: this.rootUrl.concat(`/ehrbase/rest/openehr/v1/ehr/${ehrId}/composition/${compositionUUID}`),
                method: 'get',
                headers: {
                    authorization: this.apiKey,
                    contentType: 'application/json',
                    accept: 'application/json'
                }
            })
            console.log(response.data)
            return response.data
        } catch (error) {
            console.log(JSON.stringify(error.response))
            throw new Error('Unable to get composition: ' + error.response.data)
        }
    }

    static async getAllPatientCompositions(ehrId) {
      try {
        return await axios({
          url: this.aqlUrl,
          method: 'POST',
          headers: {
            authorization: this.apiKey,
            contentType: 'application/json',
            accept: 'application/json'
          },
          data: AqlQueries.getAllPatientCompositionsQuery(ehrId)
        })
      } catch (error) {
        throw new Error('Unable to make aql query: ' + error.response.data)
      }
    }

    static async postComposition(ehrID, data) {
      console.log(JSON.stringify(buildComposition(data)))
      try {
        return await axios({
          url: this.rootUrl + `/ehrbase/rest/openehr/v1/ehr/${ehrID}/composition`,
          method: 'post',
          headers: {
            authorization: this.apiKey,
            contentType: 'application/json',
            accept: 'application/json'
          },
          data: buildComposition(data)
        })
      } catch (error) {
          console.log(JSON.stringify(error.response))
          console.log(error)
          throw new Error('Unable to post composition: ' + error.response.data)
      }
    }

    static async postEhr() {
       try {
        return await axios({
          url: this.rootUrl + `/ehrbase/rest/openehr/v1/ehr/`,
          method: 'post',
          headers: {
            authorization: this.apiKey,
            contentType: 'application/json',
            accept: 'application/json'
          }
        })
      } catch (error) {
          console.log(JSON.stringify(error.response))
          console.log(error)
          throw new Error('Unable to create EHR: ' + error.response.data)
      }
    }
}


export class NodeService {
    static rootUrl = 'http://localhost:4000'

    static async postNewPatient(patient, token) {
      fetch(this.rootUrl + '/new', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json',
              'x-access-token': token
            },
            body: JSON.stringify(patient)
        }).then(res => res.json()).then(data => {
            console.log(data)
        })
    }

    static async getPatientByEhr(ehrId) {
      return fetch(this.rootUrl + `/patient/${ehrId}`, {
        method: 'GET',
        headers: {
          'Content-Type': 'application/json'
        }
      }).then(res => res.json()).then(data => {
        return data
      })
    }

    static async getAllDoctorPatients(token) {
      return fetch(this.rootUrl + '/patients', {
        method: 'GET',
        headers: {
          'Content-Type': 'application/json',
          'x-access-token': token
        }
      }).then(res => res.json()).then(data => {
        return data
      })
    }
}


