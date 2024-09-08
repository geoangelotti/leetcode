CC = gcc
CFLAGS = -Wall -Werror -Wextra -pedantic
C_STD = c18

SRC_DIR = src
TEST_DIR = test

SRC_FILES = $(wildcard $(SRC_DIR)/*.c)
TEST_FILES = $(wildcard $(TEST_DIR)/*.c)

all: test

test: $(TEST_FILES) $(SRC_DIR)/treenode.o
	$(CC) $(CFLAGS) --std=$(C_STD) -o test_invert_binary_tree.out $(TEST_DIR)/test_invert_binary_tree.c $(SRC_DIR)/treenode.o
	./test_invert_binary_tree.out

clean:
	rm -f *.out