import os
from timeit import default_timer as timer
import datetime

def time_func(func):
    """function to record time and the result given by the function"""
    ct = datetime.datetime.now()
    print(func.func.__name__, "has started at", ct)
    start = timer()
    result = func()
    end = timer()
    ct = datetime.datetime.now()
    print(func.func.__name__, "is finished", ct)
    return { "algorithm": func.func.__name__, "startTime": start, "endTime": end, "duration": end - start, "result": result }

def print_data(data: dict, problem_id: int):
    title_header = f"{"="*50} Problem {problem_id} {"="*50}"
    print(title_header)
    print("function:", data["algorithm"])
    # print(data["startTime"])
    # print(data["endTime"])
    print("duration:", data["duration"], "seconds")
    print("result:", data["result"])
    print("="* len(title_header))

def save_data(data: dict, problem_id: int, filename_stats="data.csv", filename_result="result.txt"):
    if not os.path.isfile(filename_stats):
        with open(filename_stats, "w") as wf:
            wf.write("prblemId,algorithm,startTime,endTime,duration,result,notes\n")

    with open(filename_stats, "a") as af:
        af.write(f"{problem_id},")
        af.write(f"{data["algorithm"]},")
        af.write(f"{data["startTime"]},")
        af.write(f"{data["endTime"]},")
        af.write(f"{data["duration"]},")
        af.write(f"{filename_result}\n")
        # af.write(f"{}\n")

    with open(filename_result, "w") as wf:
        wf.write(f"{data["result"]}")