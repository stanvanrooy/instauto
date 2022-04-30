.PHONY: test

test:
	pyre incremental
test.watch:
	watchman-make -p "**/*.py" -t test
