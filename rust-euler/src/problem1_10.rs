pub fn problem1() -> i32 {
    let mut vec: Vec<i32> = Vec::new();
    for i in 1..1_000 {
        if i % 3 == 0 || i % 5 == 0 {
            vec.push(i);
        }
    }
    vec.iter().sum()
}