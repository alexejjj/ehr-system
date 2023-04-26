
export function buildComposition({height,
                                   weight,
                                   hairColor,
                                   eyeColor,
                                   skinTone,
                                   freckles,
                                   doesTheSkinTurnRedWhenSunburned,
                                   doesTheSkinTanInTheSun,
                                   howOftenDoYouHaveVacationInTheSouth,
                                   doYouUseSunscreenInSummer,
                                   sport,
                                   doYouHaveAHistoryOfPsoriasis,
                                   whenDidTheLesionAppear,
                                   summary,
                                   heightX,
                                   widthY,
                                   area,
                                   borders,
                                   dominantColor,
                                   shape,
                                   inclusions,
                                   symmetry,
                                   problemDiagnosisName,
                                   clinicalDescription,
                                   comment,
                                    photo,
                                    familyDiagnosisName,
                                    familyDescription,
                                    familyCases}) {
    return {
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
              "value" : "2022-06-09T17:34:05.752"
            },
            "end_time" : {
              "_type" : "DV_DATE_TIME",
              "value" : "2022-06-09T17:34:05.752"
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
                  "value" : "2022-06-09T17:34:05.752"
                },
                "events" : [ {
                  "_type" : "POINT_EVENT",
                  "name" : {
                    "_type" : "DV_TEXT",
                    "value" : "Any event"
                  },
                  "time" : {
                    "_type" : "DV_DATE_TIME",
                    "value" : "2022-06-09T17:34:05.752"
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
                        "magnitude" : weight
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
                  "value" : "2022-06-09T17:34:05.752"
                },
                "events" : [ {
                  "_type" : "POINT_EVENT",
                  "name" : {
                    "_type" : "DV_TEXT",
                    "value" : "Any event"
                  },
                  "time" : {
                    "_type" : "DV_DATE_TIME",
                    "value" : "2022-06-09T17:34:05.752"
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
                        "magnitude" : height
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
                    "value" : hairColor
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
                    "value" : eyeColor
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
                    "value" : skinTone
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
                  "value" : "2022-06-09T17:34:05.752"
                },
                "events" : [ {
                  "_type" : "POINT_EVENT",
                  "name" : {
                    "_type" : "DV_TEXT",
                    "value" : "Any event"
                  },
                  "time" : {
                    "_type" : "DV_DATE_TIME",
                    "value" : "2022-06-09T17:34:05.752"
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
                        "value" : freckles.value,
                        "defining_code" : {
                          "_type" : "CODE_PHRASE",
                          "terminology_id" : {
                            "_type" : "TERMINOLOGY_ID",
                            "value" : "local"
                          },
                          "code_string" : freckles.code
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
                        "value" : doesTheSkinTurnRedWhenSunburned
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
                        "value" : doesTheSkinTanInTheSun.value,
                        "defining_code" : {
                          "_type" : "CODE_PHRASE",
                          "terminology_id" : {
                            "_type" : "TERMINOLOGY_ID",
                            "value" : "local"
                          },
                          "code_string" : doesTheSkinTanInTheSun.code
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
                        "value" : howOftenDoYouHaveVacationInTheSouth.value,
                        "defining_code" : {
                          "_type" : "CODE_PHRASE",
                          "terminology_id" : {
                            "_type" : "TERMINOLOGY_ID",
                            "value" : "local"
                          },
                          "code_string" : howOftenDoYouHaveVacationInTheSouth.code
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
                        "value" : doYouUseSunscreenInSummer
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
                        "value" : sport.value,
                        "defining_code" : {
                          "_type" : "CODE_PHRASE",
                          "terminology_id" : {
                            "_type" : "TERMINOLOGY_ID",
                            "value" : "local"
                          },
                          "code_string" : sport.code
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
                  "value" : "2022-06-09T17:34:05.752"
                },
                "events" : [ {
                  "_type" : "POINT_EVENT",
                  "name" : {
                    "_type" : "DV_TEXT",
                    "value" : "Any event"
                  },
                  "time" : {
                    "_type" : "DV_DATE_TIME",
                    "value" : "2022-06-09T17:34:05.752"
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
                        "value" : doYouHaveAHistoryOfPsoriasis
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
                        "value" : whenDidTheLesionAppear
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
                    "value" : summary
                  },
                  "archetype_node_id" : "at0002"
                }, {
                  "_type" : "CLUSTER",
                  "name" : {
                    "_type" : "DV_TEXT",
                    "value" : "Per problem"
                  },
                  "items" : [ {
                    "_type" : "ELEMENT",
                    "name" : {
                      "_type" : "DV_TEXT",
                      "value" : "Problem/diagnosis name"
                    },
                    "value" : {
                      "_type" : "DV_TEXT",
                      "value" : familyDiagnosisName
                    },
                    "archetype_node_id" : "at0029"
                  }, {
                    "_type" : "ELEMENT",
                    "name" : {
                      "_type" : "DV_TEXT",
                      "value" : "Cases"
                    },
                    "value" : {
                      "_type" : "DV_BOOLEAN",
                      "value" : familyCases
                    },
                    "archetype_node_id" : "at0071"
                  }, {
                    "_type" : "ELEMENT",
                    "name" : {
                      "_type" : "DV_TEXT",
                      "value" : "Description"
                    },
                    "value" : {
                      "_type" : "DV_TEXT",
                      "value" : familyDescription
                    },
                    "archetype_node_id" : "at0030"
                  } ],
                  "archetype_node_id" : "at0028"
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
                  "value" : "2022-06-09T17:34:05.752"
                },
                "events" : [ {
                  "_type" : "POINT_EVENT",
                  "name" : {
                    "_type" : "DV_TEXT",
                    "value" : "Any event"
                  },
                  "time" : {
                    "_type" : "DV_DATE_TIME",
                    "value" : "2022-06-09T17:34:05.752"
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
                          "magnitude" : heightX
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
                          "magnitude" : widthY
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
                          "magnitude" : area
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
                          "value" : borders.value,
                          "defining_code" : {
                            "_type" : "CODE_PHRASE",
                            "terminology_id" : {
                              "_type" : "TERMINOLOGY_ID",
                              "value" : "local"
                            },
                            "code_string" : borders.code
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
                          "value" : dominantColor.value,
                          "defining_code" : {
                            "_type" : "CODE_PHRASE",
                            "terminology_id" : {
                              "_type" : "TERMINOLOGY_ID",
                              "value" : "local"
                            },
                            "code_string" : dominantColor.code
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
                          "value" : shape.value,
                          "defining_code" : {
                            "_type" : "CODE_PHRASE",
                            "terminology_id" : {
                              "_type" : "TERMINOLOGY_ID",
                              "value" : "local"
                            },
                            "code_string" : shape.code
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
                          "value" : inclusions
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
                          "value" : symmetry
                        },
                        "archetype_node_id" : "at0010"
                      }, {
                        "_type" : "ELEMENT",
                        "name" : {
                          "_type" : "DV_TEXT",
                          "value" : "Photo"
                        },
                        "value" : {
                          "_type" : "DV_MULTIMEDIA",
                          "charset" : {
                            "_type" : "CODE_PHRASE",
                            "terminology_id" : {
                              "_type" : "TERMINOLOGY_ID",
                              "value" : ""
                            },
                            "code_string" : ""
                          },
                            "data": photo,
                            "media_type" : {
                            "_type" : "CODE_PHRASE",
                            "terminology_id" : {
                                "_type" : "TERMINOLOGY_ID",
                                "value" : "local"
                            },
                            "code_string" : ""
                          },
                          "size" : 100
                        },
                        "archetype_node_id" : "at0011"
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
                    "value" : problemDiagnosisName
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
                    "value" : clinicalDescription
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
                    "value" : comment
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
}

export const compositionData = {
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
      "value" : "2022-06-09T17:34:05.752"
    },
    "end_time" : {
      "_type" : "DV_DATE_TIME",
      "value" : "2022-06-09T17:34:05.752"
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
          "value" : "2022-06-09T17:34:05.752"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-06-09T17:34:05.752"
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
          "value" : "2022-06-09T17:34:05.752"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-06-09T17:34:05.752"
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
          "value" : "2022-06-09T17:34:05.752"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-06-09T17:34:05.752"
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
          "value" : "2022-06-09T17:34:05.752"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-06-09T17:34:05.752"
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
        }, {
          "_type" : "CLUSTER",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Per problem"
          },
          "items" : [ {
            "_type" : "ELEMENT",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Problem/diagnosis name"
            },
            "value" : {
              "_type" : "DV_TEXT",
              "value" : "Diagnosis name"
            },
            "archetype_node_id" : "at0029"
          }, {
            "_type" : "ELEMENT",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Cases"
            },
            "value" : {
              "_type" : "DV_BOOLEAN",
              "value" : true
            },
            "archetype_node_id" : "at0071"
          }, {
            "_type" : "ELEMENT",
            "name" : {
              "_type" : "DV_TEXT",
              "value" : "Description"
            },
            "value" : {
              "_type" : "DV_TEXT",
              "value" : "Family history description"
            },
            "archetype_node_id" : "at0030"
          } ],
          "archetype_node_id" : "at0028"
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
          "value" : "2022-06-09T17:34:05.752"
        },
        "events" : [ {
          "_type" : "POINT_EVENT",
          "name" : {
            "_type" : "DV_TEXT",
            "value" : "Any event"
          },
          "time" : {
            "_type" : "DV_DATE_TIME",
            "value" : "2022-06-09T17:34:05.752"
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
              }, {
                "_type" : "ELEMENT",
                "name" : {
                  "_type" : "DV_TEXT",
                  "value" : "Photo"
                },
                "value" : {
                  "_type" : "DV_MULTIMEDIA",
                  "charset" : {
                    "_type" : "CODE_PHRASE",
                    "terminology_id" : {
                      "_type" : "TERMINOLOGY_ID",
                      "value" : ""
                    },
                    "code_string" : ""
                  },
                  "data" : "/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQECAgMCAgICAgQDAwIDBQQFBQUEBAQFBgcGBQUHBgQEBgkGBwgICAgIBQYJCgkICgcICAj/2wBDAQEBAQICAgQCAgQIBQQFCAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAj/wAARCADXAqkDASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/90ABAAF/9oADAMBAAIRAxEAPwD+/iiiigAooooAKKKKACiiigAooooA/9D+/iiiigAooooAKKKKACiiigAooooA/9H+/iiiigAooooAKKKKACiiigAooooA/9L+/iiiigAooooAKKKKACiiigAooooA/9P+/iiiigAooooAKKKKACiiigAooooA/9T+/iiiigAooooAKKKKACiiigAooooA/9X+/iiiigAooooAKKKKACiiigAooooA/9b+/iiiigAooooAKKKKACiiigAooooA/9f+/iiiigAooooA+dv2u/8Ak039qD/snniT/wBNtxX0TXzt+13/AMmm/tQf9k88Sf8AptuK+iaACiiigAooooA//9D+/iiiigAooooAKKKK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fZzqNy0csdysxOwySSbRVjwh+yLZeFrzWvEN98evj/42+IVzo1r4c0/xPq99pp1LQdKhuFnNraGGxihPmsiebNPFLPKFXdKSqkc+GjOM7y2aS11asp2t05m3Hmet0nrdK94pxl8OlmvL+RO/l7s2lprJaWbt/9X+pey+P3xxfW9M+OUvxJvH+Hl38b7n4U/8IENKsRYRaamry6Gt2LnyPtxvvtUIuixn8kxMYxCDh6/VghWCluM18lwfsd+Arb4op8Ql8ZfEiTwzH4mfxrD4Ja6tv7Bg8QPCY21FV8j7V5hLvN5JuDbiZjKIg/zV9b45OeWrDDqSpJT3/TlirN9feUnfqmttlVdxdRuO2v4yk1p5RaT7tPfdzUUUVuSFFFFABRRRQAUUUUAf/9b+2/8Aa7/5NN/ag/7J54k/9NtxX0TXzt+13/yab+1B/wBk88Sf+m24r6JoAKKKKACiiigAooooAKKKKAP/1/7+KKKKACiiigAooooAKKKKACiiigD/0P7+KKKKACiiigAooooAKKKKACiiigD/0f7+KKKKACiiigAooooAKKKKACiiigD/0v7+KKKKACiiigAooooAKKKKACiiigD/0/7+KKKKACiiigAooooAKKKKACiiigD/1P7+KKKKACiiigAooooAKKKKACiiigD/1f7+KKKKACiiigAooooAKKKKACiiigD/1v7+KKKKACiiigAooooA+dv2u/8Ak039qD/snniT/wBNtxX0TXzt+13/AMmm/tQf9k88Sf8AptuK+iaACiiigD//1/7+KKKKACiiigAooooAKKKKACiiigD/0P7+KKKKACiiigAooooAKKKKACiiigD/0f7+KKKKACiiigAooooAKKKKACiiigD/0v7+KKKKACiiigAooooAKKKKACiiigD/0/7+KKKKACiiigAooooAKKKKACiiigD/1P7+KKKKACiiigAooooAKKKKACiiigD/1f7+KKKKACiiigAooooAKKKKACiiigD/1v7+KKKKACiiigAooooAKKKKACiiigD/1/7+KKKKAPnb9rv/AJNN/ag/7J54k/8ATbcV9E187ftd/wDJpv7UH/ZPPEn/AKbbivomgD//2Q==",
                  "media_type" : {
                    "_type" : "CODE_PHRASE",
                    "terminology_id" : {
                        "_type" : "TERMINOLOGY_ID",
                        "value" : "local"
                    },
                    "code_string" : ""
                  },
                  "size" : 100
                },
                "archetype_node_id" : "at0011"
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
