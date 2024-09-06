CC = g++
CFLAGS = -Wall -Werror -Wextra -pedantic -std=c++23

SRC_DIR = src
TEST_DIR = test

SRC_FILES = $(wildcard $(SRC_DIR)/*.cpp)
TEST_FILES = $(wildcard $(TEST_DIR)/*.cpp)

all: test

test: $(TEST_FILES)
	$(CC) $(CFLAGS) -o test_richest_customer_wealth.out $(TEST_DIR)/test_richest_customer_wealth.cpp
	./test_richest_customer_wealth.out