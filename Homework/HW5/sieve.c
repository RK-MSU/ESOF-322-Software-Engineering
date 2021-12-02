#include "stdlib.h"

typedef struct IntList {
    int value;
    struct IntList *next;
} *INTLIST, INTCELL;

INTLIST sieve(int upper_bound) {
    INTLIST prime_list = NULL;   /* list of primes found */
    INTLIST cursor;              /* cursor into prime list */
    int candidate;               /* a candidate prime number */
    int is_prime;                /* flag: 1=prime, 0=not prime */

/* try all numbers up to upper_bound */
    for (candidate = 2; candidate <= upper_bound; candidate++) {
        is_prime = 1; /* assume candidate is prime */
        for (cursor = prime_list; cursor; cursor = cursor->next) {
            if (candidate % cursor->value == 0) {
                /* candidate divisible by prime */
                /* in list, can't be prime */
                is_prime = 0;
                break;  /* "for cursor" loop */
            }
        }
        if (is_prime) {
            /* add candidate to front of list */
            cursor = (INTLIST) malloc(sizeof(INTCELL));
            cursor->value = candidate;
            cursor->next = prime_list;
            prime_list = cursor;
        }
    }
    return prime_list;
}