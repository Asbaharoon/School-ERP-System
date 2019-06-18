<%@ include file="header.jsp"%>

 <div class="dashboard-content-one">
	<!-- Breadcubs Area Start Here -->
	<div class="breadcrumbs-area">
		<h3>Staff</h3>
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li>Add Staff</li>
		</ul>
	</div>
	<!-- Breadcubs Area End Here -->
	<!-- Admit Form Area Start Here -->
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Add New Staff</h3>
				</div>
				<div class="dropdown">
					<a class="dropdown-toggle" href="#" role="button"
						data-toggle="dropdown" aria-expanded="false">...</a>

					<div class="dropdown-menu dropdown-menu-right">
						<a class="dropdown-item" href="#"><i
							class="fas fa-times text-orange-red"></i>Close</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-cogs text-dark-pastel-green"></i>Edit</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
					</div>
				</div>
			</div>
			<form class="new-added-form">

				<div class="row">
					
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Staff-Type *</label> <select class="select2">
							<option value="">Please Select Staff *</option>
							<option value="1">Male</option>
							<option value="2">Female</option>
							<option value="3">Others</option>
						</select>
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Full Name *</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Class Teacher *</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<!-- <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Last Name *</label>
                                    <input type="text" placeholder="" class="form-control">
                                </div> -->
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Gender *</label> <select class="select2">
							<option value="">Please Select Gender *</option>
							<option value="1">Male</option>
							<option value="2">Female</option>
							<option value="3">Others</option>
						</select>
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>E-Mail</label> <input type="email" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Contact no</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Staff Date *</label> <input type="text"
							placeholder="dd/mm/yyyy" class="form-control air-datepicker"
							data-position='bottom right'> <i
							class="far fa-calendar-alt"></i>
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Address Line</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>City</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>State</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Pincode</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Date Of Birth *</label> <input type="text"
							placeholder="dd/mm/yyyy" class="form-control air-datepicker"
							data-position='bottom right'> <i
							class="far fa-calendar-alt"></i>
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Salary</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Qualification</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Password</label> <input type="text" placeholder=""
							class="form-control">
					</div>
					<!--  <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Blood Group *</label>
                                    <select class="select2">
                                        <option value="">Please Select Group *</option>
                                        <option value="1">A+</option>
                                        <option value="2">A-</option>
                                        <option value="3">B+</option>
                                        <option value="3">B-</option>
                                        <option value="3">O+</option>
                                        <option value="3">O-</option>
                                    </select>
                                </div> -->
					<!-- <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Religion *</label>
                                    <select class="select2">
                                        <option value="">Please Select Religion *</option>
                                        <option value="1">Islam</option>
                                        <option value="2">Hindu</option>
                                        <option value="3">Christian</option>
                                        <option value="3">Buddish</option>
                                        <option value="3">Others</option>
                                    </select>
                                </div> -->
					
					<!-- <div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Section *</label> <select class="select2">
							<option value="">Please Select Section *</option>
							<option value="1">Primary</option>
							<option value="2">Secondary</option>
							<option value="3">Higher</option>
						</select>
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Standard *</label> <select class="select2">
							<option value="">Please Select Standard *</option>
							<option value="1">Play</option>
							<option value="2">Nursery</option>
							<option value="3">One</option>
							<option value="3">Two</option>
							<option value="3">Three</option>
							<option value="3">Four</option>
							<option value="3">Five</option>
						</select>
					</div>
					<div class="col-xl-4 col-lg-6 col-12 form-group">
						<label>Division *</label> <select class="select2">
							<option value="">Please Select Division *</option>
							<option value="1">A</option>
							<option value="2">B</option>
							<option value="3">C</option>
						</select>
					</div> -->
					<!-- <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Section *</label>
                                    <select class="select2">
                                        <option value="">Please Select Section *</option>
                                        <option value="1">Pink</option>
                                        <option value="2">Blue</option>
                                        <option value="3">Bird</option>
                                        <option value="3">Rose</option>
                                        <option value="3">Red</option>
                                    </select>
                                </div> -->
					<!-- <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Admission ID</label>
                                    <input type="text" placeholder="" class="form-control">
                                </div> -->
					
					<!-- <div class="col-lg-6 col-12 form-group">
                                    <label>Short BIO</label>
                                    <textarea class="textarea form-control" name="message" id="form-message" cols="10"
                                        rows="9"></textarea>
                                </div> -->
					<div class="col-lg-6 col-12 form-group mg-t-30">
						<label class="text-dark-medium">Upload Staff Photo
							(150px X 150px)</label> <input type="file" class="form-control-file">
					</div>
					<div class="col-lg-6 col-12 form-group mg-t-30">
						<label class="text-dark-medium">Upload Staff	 Proof
							(150px X 150px)</label> <input type="file" class="form-control-file">
					</div>
					<div class="col-12 form-group mg-t-8">
						<button type="submit"
							class="btn-fill-lg btn-gradient-yellow btn-hover-bluedark">Save</button>
						<button type="reset"
							class="btn-fill-lg bg-blue-dark btn-hover-yellow">Reset</button>
					</div>
				</div>
			</form>
		</div>
	</div>

                <%@ include file="footer.jsp"%>