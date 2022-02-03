package com.github.ndaghboudj.covid19_checker;


public final class DecisionTreeClassifier {

    private static int findMax(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index = nums[i] > nums[index] ? i : index;
        }
        return index;
    }

    public static int predict(double[] features) {
        int[] classes = new int[2];
            
        if (features[6] <= 0.5) {
            if (features[3] <= 0.5) {
                if (features[0] <= 0.5) {
                    if (features[8] <= 0.5) {
                        classes[0] = 572; 
                        classes[1] = 0; 
                    } else {
                        if (features[2] <= 0.5) {
                            if (features[7] <= 0.5) {
                                classes[0] = 42; 
                                classes[1] = 0; 
                            } else {
                                if (features[10] <= 0.5) {
                                    classes[0] = 15; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[5] <= 0.5) {
                                        classes[0] = 5; 
                                        classes[1] = 1; 
                                    } else {
                                        classes[0] = 6; 
                                        classes[1] = 0; 
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0; 
                            classes[1] = 50; 
                        }
                    }
                } else {
                    if (features[8] <= 0.5) {
                        if (features[2] <= 0.5) {
                            classes[0] = 38; 
                            classes[1] = 0; 
                        } else {
                            if (features[7] <= 0.5) {
                                if (features[1] <= 0.5) {
                                    classes[0] = 27; 
                                    classes[1] = 0; 
                                } else {
                                    if (features[4] <= 0.5) {
                                        if (features[10] <= 0.5) {
                                            classes[0] = 34; 
                                            classes[1] = 22; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 18; 
                                        }
                                    } else {
                                        if (features[5] <= 0.5) {
                                            classes[0] = 0; 
                                            classes[1] = 12; 
                                        } else {
                                            classes[0] = 17; 
                                            classes[1] = 14; 
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 48; 
                            }
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 129; 
                    }
                }
            } else {
                if (features[8] <= 0.5) {
                    if (features[7] <= 0.5) {
                        if (features[0] <= 0.5) {
                            if (features[2] <= 0.5) {
                                classes[0] = 106; 
                                classes[1] = 0; 
                            } else {
                                if (features[1] <= 0.5) {
                                    classes[0] = 54; 
                                    classes[1] = 0; 
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 45; 
                                }
                            }
                        } else {
                            if (features[1] <= 0.5) {
                                if (features[4] <= 0.5) {
                                    if (features[2] <= 0.5) {
                                        classes[0] = 16; 
                                        classes[1] = 0; 
                                    } else {
                                        if (features[10] <= 0.5) {
                                            classes[0] = 16; 
                                            classes[1] = 4; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 8; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 8; 
                                }
                            } else {
                                if (features[10] <= 0.5) {
                                    if (features[4] <= 0.5) {
                                        if (features[5] <= 0.5) {
                                            classes[0] = 0; 
                                            classes[1] = 21; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 37; 
                                        }
                                    } else {
                                        if (features[2] <= 0.5) {
                                            classes[0] = 27; 
                                            classes[1] = 22; 
                                        } else {
                                            classes[0] = 11; 
                                            classes[1] = 32; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 100; 
                                }
                            }
                        }
                    } else {
                        if (features[4] <= 0.5) {
                            classes[0] = 0; 
                            classes[1] = 203; 
                        } else {
                            if (features[10] <= 0.5) {
                                if (features[9] <= 0.5) {
                                    if (features[2] <= 0.5) {
                                        classes[0] = 16; 
                                        classes[1] = 5; 
                                    } else {
                                        if (features[5] <= 0.5) {
                                            classes[0] = 0; 
                                            classes[1] = 32; 
                                        } else {
                                            classes[0] = 16; 
                                            classes[1] = 25; 
                                        }
                                    }
                                } else {
                                    classes[0] = 0; 
                                    classes[1] = 24; 
                                }
                            } else {
                                classes[0] = 0; 
                                classes[1] = 95; 
                            }
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 977; 
                }
            }
        } else {
            classes[0] = 0; 
            classes[1] = 2451; 
        }
    
        return findMax(classes);
    }
}
