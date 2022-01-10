class DecisionTreeClassifier {

    private static int findMax(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = nums[i] > nums[index] ? i : index;
        }
        return index;
    }

    public static int predict(double[] features) {
        int[] classes = new int[2];
            
        if (features[3] <= 0.5) {
            if (features[6] <= 0.5) {
                if (features[0] <= 0.5) {
                    if (features[8] <= 0.5) {
                        classes[0] = 459; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 0.5) {
                            if (features[7] <= 0.5) {
                                classes[0] = 35; 
                                classes[1] = 0; 
                            } else {
                                if (features[10] <= 0.5) {
                                    classes[0] = 11; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 8; 
                                    classes[1] = 1; 
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 39; 
                        }
                    }
                } else {
                    if (features[8] <= 0.5) {
                        if (features[1] <= 0.5) {
                            classes[0] = 31; 
                            classes[1] = 0; 
                        } else {
                            if (features[2] <= 0.5) {
                                classes[0] = 20; 
                                classes[1] = 0; 
                            } else {
                                if (features[7] <= 0.5) {
                                    if (features[10] <= 0.5) {
                                        if (features[9] <= 0.5) {
                                            classes[0] = 41; 
                                            classes[1] = 27; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 5; 
                                        }
                                    } else {
                                        if (features[9] <= 0.5) {
                                            classes[0] = 0; 
                                            classes[1] = 6; 
                                        } else {
                                            classes[0] = 7; 
                                            classes[1] = 10; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 38; 
                                }
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 102; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 340; 
            }
        } else {
            if (features[2] <= 0.5) {
                if (features[0] <= 0.5) {
                    if (features[7] <= 0.5) {
                        classes[0] = 85; 
                        classes[1] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 14; 
                    }
                } else {
                    if (features[8] <= 0.5) {
                        if (features[1] <= 0.5) {
                            classes[0] = 16; 
                            classes[1] = 0; 
                        } else {
                            if (features[10] <= 0.5) {
                                if (features[4] <= 0.5) {
                                    classes[0] = 0; 
                                    classes[1] = 34; 
                                } else {
                                    if (features[9] <= 0.5) {
                                        if (features[7] <= 0.5) {
                                            classes[0] = 13; 
                                            classes[1] = 9; 
                                        } else {
                                            classes[0] = 10; 
                                            classes[1] = 5; 
                                        }
                                    } else {
                                        if (features[7] <= 0.5) {
                                            classes[0] = 7; 
                                            classes[1] = 12; 
                                        } else {
                                            classes[0] = 0; 
                                            classes[1] = 15; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 71; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 205; 
                    }
                }
            } else {
                if (features[1] <= 0.5) {
                    if (features[0] <= 0.5) {
                        if (features[8] <= 0.5) {
                            classes[0] = 38; 
                            classes[1] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[7] <= 0.5) {
                                if (features[8] <= 0.5) {
                                    if (features[4] <= 0.5) {
                                        if (features[10] <= 0.5) {
                                            classes[0] = 14; 
                                            classes[1] = 4; 
                                        } else {
                                            classes[0] = 8; 
                                            classes[1] = 6; 
                                        }
                                    } else {
                                        classes[0] = 0; 
                                        classes[1] = 6; 
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 20; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 73; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 210; 
                        }
                    }
                } else {
                    if (features[6] <= 0.5) {
                        if (features[8] <= 0.5) {
                            if (features[10] <= 0.5) {
                                if (features[5] <= 0.5) {
                                    classes[0] = 0; 
                                    classes[1] = 58; 
                                } else {
                                    if (features[0] <= 0.5) {
                                        classes[0] = 0; 
                                        classes[1] = 34; 
                                    } else {
                                        if (features[4] <= 0.5) {
                                            classes[0] = 9; 
                                            classes[1] = 68; 
                                        } else {
                                            classes[0] = 23; 
                                            classes[1] = 41; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 209; 
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 552; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1291; 
                    }
                }
            }
        }
    
        return findMax(classes);
    }

    public static void main(String[] args) {
        if (args.length == 11) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            int prediction = DecisionTreeClassifier.predict(features);
            System.out.println(prediction);

        }
    }
}